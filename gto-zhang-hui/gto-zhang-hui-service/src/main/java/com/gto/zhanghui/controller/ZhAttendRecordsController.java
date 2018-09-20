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
import com.gto.zhanghui.entity.ZhAttendRecordsEntity;
import com.gto.zhanghui.response.VisitCollect;
import com.gto.zhanghui.response.VisitFarewellDetail;
import com.gto.zhanghui.service.ZhAttendRecordsService;
import com.gto.zhanghui.utils.FileUtil;

import io.swagger.annotations.ApiOperation;



/**
 * 拜访记录表
 *
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
@RestController
@RequestMapping("api/zhanghui/v1")
@CrossOrigin
public class ZhAttendRecordsController {
    @Autowired
    private ZhAttendRecordsService zhAttendRecordsService;

    @GetMapping("/visit-history-query")
    @ApiOperation(value = "查询拜访拜别记录")
    public R visitHistoryQuery(@RequestParam(required = false) String startTime,
    						   @RequestParam(required = false) String endTime,
    						   @RequestParam(required = false) String siteCode,
    						   @RequestParam(required = false) String empCode,
    						   @RequestParam(defaultValue = "1") int currPage,
    						   @RequestParam(defaultValue = "10") int pageSize) {
    	List<VisitCollect> visitCollects = zhAttendRecordsService.queryVisitCollect(empCode, siteCode, startTime, endTime, currPage*pageSize-pageSize, pageSize);
    	int totalCount = zhAttendRecordsService.selectVisitHistoryCount(empCode, siteCode, startTime, endTime);
    	PageUtils page = new PageUtils(visitCollects, totalCount, pageSize, currPage);
    	return R.ok().put("data", page);
    }
    
    @GetMapping("/visit-history-show")
    @ApiOperation(value = "查询拜访拜别记录明细")
    public R visitFarewellquery(@RequestParam(required = false) String startTime,
			   				    @RequestParam(required = false) String endTime,
			   				    @RequestParam(required = false) String account,
			   				    @RequestParam(defaultValue = "1") int currPage,
			   				    @RequestParam(defaultValue = "10") int pageSize) {
    	List<VisitFarewellDetail> visitFarewellDetails = zhAttendRecordsService.queryVisitFarewellDetail(startTime, endTime, account,currPage*pageSize-pageSize, pageSize);
    	int totalCount = zhAttendRecordsService.selectVisitCount(startTime, endTime, account);
    	PageUtils page = new PageUtils(visitFarewellDetails, totalCount, pageSize, currPage);
    	return R.ok().put("data", page);
    }
    
    @GetMapping("/nofarewell-history-show")
    @ApiOperation(value = "查询未拜别记录明细")
    public R noFarewellquery(@RequestParam(required = false) String startTime,
			   				 @RequestParam(required = false) String endTime,
			   				 @RequestParam(required = false) String account,
			   				 @RequestParam(defaultValue = "1") int currPage,
		   				     @RequestParam(defaultValue = "10") int pageSize) {
    	List<VisitFarewellDetail> visitFarewellDetails = zhAttendRecordsService.queryNoFarewellDetail(startTime, endTime, account,currPage*pageSize-pageSize, pageSize);
    	int totalCount = zhAttendRecordsService.selectNoFarewellCount(startTime, endTime, account);
    	PageUtils page = new PageUtils(visitFarewellDetails, totalCount, pageSize, currPage);
    	return R.ok().put("data", page);
    }
    
    @GetMapping("/visit-history-export")
    @ApiOperation(value = "拜访拜别明细导出excel")
    public R visitFarewellexport(@RequestParam(required = false) String startTime,
			   				 	 @RequestParam(required = false) String endTime,
			   				 	 @RequestParam(required = false) String account,
			   				 	 @RequestParam(defaultValue = "1") int currPage,
			   				     @RequestParam(defaultValue = "10") int pageSize,
			   				 	 HttpServletResponse response) {
    	List<VisitFarewellDetail> visitFarewellDetails = zhAttendRecordsService.queryVisitFarewellDetail(startTime, endTime, account,currPage*pageSize-pageSize, pageSize);
    	FileUtil.exportExcel(visitFarewellDetails, "拜访记录", "6666", VisitFarewellDetail.class, "拜访记录表.xls", response);
    	return R.ok();
    }
    
    /**
     * 列表
     */
    @RequestMapping("/listVisit")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = zhAttendRecordsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/infoVisit/{id}")
    public R info(@PathVariable("id") Integer id){
        ZhAttendRecordsEntity zhAttendRecords = zhAttendRecordsService.selectById(id);

        return R.ok().put("zhAttendRecords", zhAttendRecords);
    }

    /**
     * 保存
     */
    @RequestMapping("/saveVisit")
    public R save(@RequestBody ZhAttendRecordsEntity zhAttendRecords){
        zhAttendRecordsService.insert(zhAttendRecords);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/updateVisit")
    public R update(@RequestBody ZhAttendRecordsEntity zhAttendRecords){
        ValidatorUtils.validateEntity(zhAttendRecords);
        zhAttendRecordsService.updateAllColumnById(zhAttendRecords);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/deleteVisit")
    public R delete(@RequestBody Integer[] ids){
        zhAttendRecordsService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
