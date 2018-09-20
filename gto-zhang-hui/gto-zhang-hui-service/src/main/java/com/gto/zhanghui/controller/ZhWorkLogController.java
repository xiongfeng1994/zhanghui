package com.gto.zhanghui.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gto.common.utils.PageUtils;
import com.gto.common.utils.R;
import com.gto.common.validator.ValidatorUtils;
import com.gto.zhanghui.entity.ZhWorkLogEntity;
import com.gto.zhanghui.response.VisitFarewellDetail;
import com.gto.zhanghui.response.WorkLogCollect;
import com.gto.zhanghui.response.WorkLogDetail;
import com.gto.zhanghui.service.ZhWorkLogService;
import com.gto.zhanghui.utils.FileUtil;

import io.swagger.annotations.ApiOperation;

/**
 * 工作日志
 *
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
@RestController
@RequestMapping("api/zhanghui/v1")
@CrossOrigin
public class ZhWorkLogController {
	@Autowired
	private ZhWorkLogService zhWorkLogService;

	@GetMapping("/log-history-query")
	@ApiOperation(value = "查询日志记录")
	public R logHistoryQuery(@RequestParam(required = false) String groupCode, 
							 @RequestParam(required = false) String empCode,
							 @RequestParam(required = false) String startTime, 
							 @RequestParam(required = false) String endTime,
							 @RequestParam(defaultValue = "1") int currPage,
							 @RequestParam(defaultValue = "10") int pageSize) {
		
		List<WorkLogCollect> workLogCollects = zhWorkLogService.selectWorkLogCollect(groupCode, empCode, startTime,
				endTime,currPage*pageSize-pageSize, pageSize);
		
		int totalCount = zhWorkLogService.selectWorkLogCollectCount(groupCode, empCode, startTime, endTime);
		PageUtils page = new PageUtils(workLogCollects, totalCount, pageSize, currPage);
		return R.ok().put("data", page);
	}

	@GetMapping("/log-history-show")
	@ApiOperation(value = "查询日志记录明细")
	public R logHistoryShow(@RequestParam(required = false) String id, 
							@RequestParam(required = false) String startTime, 
							@RequestParam(required = false) String endTime,
							@RequestParam(defaultValue = "1") int currPage,
							@RequestParam(defaultValue = "10") int pageSize) {
		
		List<WorkLogDetail> workLogDetails = zhWorkLogService.selectWorkLogDetail(id, startTime, endTime,currPage*pageSize-pageSize, pageSize);
		int totalCount = zhWorkLogService.selectWorkLogDetailCount(id, startTime, endTime);
		PageUtils page = new PageUtils(workLogDetails, totalCount, pageSize, currPage);
		return R.ok().put("data", page);
	}

	@GetMapping("/log-history-export")
	@ApiOperation(value = "导出日志明细excel")
	public R logHistoryExport(@RequestParam(required = false) String startTime, 
							 @RequestParam(required = false) String endTime, 
							 @RequestParam(required = false) String id,
							 @RequestParam(defaultValue = "1") int currPage,
							 @RequestParam(defaultValue = "10") int pageSize,
							 HttpServletResponse response) {
		List<WorkLogDetail> workLogDetails = zhWorkLogService.selectWorkLogDetail(id, startTime, endTime,currPage*pageSize-pageSize, pageSize);
		FileUtil.exportExcel(workLogDetails, "工作日志", "6666", WorkLogDetail.class, "工作日志表.xls", response);
		return R.ok();
	}

	/**
	 * 列表
	 */
	@RequestMapping("/listLog")
	public R list(@RequestParam Map<String, Object> params) {
		PageUtils page = zhWorkLogService.queryPage(params);

		return R.ok().put("page", page);
	}

	/**
	 * 信息
	 */
	@RequestMapping("/infoLog/{id}")
	public R info(@PathVariable("id") Integer id) {
		ZhWorkLogEntity zhWorkLog = zhWorkLogService.selectById(id);

		return R.ok().put("zhWorkLog", zhWorkLog);
	}

	/**
	 * 保存
	 */
	@RequestMapping("/saveLog")
	public R save(@RequestBody ZhWorkLogEntity zhWorkLog) {
		zhWorkLogService.insert(zhWorkLog);

		return R.ok();
	}

	/**
	 * 修改
	 */
	@RequestMapping("/updateLog")
	public R update(@RequestBody ZhWorkLogEntity zhWorkLog) {
		ValidatorUtils.validateEntity(zhWorkLog);
		zhWorkLogService.updateAllColumnById(zhWorkLog);// 全部更新

		return R.ok();
	}

	/**
	 * 删除
	 */
	@RequestMapping("/deleteLog")
	public R delete(@RequestBody Integer[] ids) {
		zhWorkLogService.deleteBatchIds(Arrays.asList(ids));

		return R.ok();
	}

}
