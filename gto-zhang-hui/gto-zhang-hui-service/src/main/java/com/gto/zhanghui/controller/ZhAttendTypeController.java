package com.gto.zhanghui.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gto.common.utils.PageUtils;
import com.gto.common.utils.R;
import com.gto.common.validator.ValidatorUtils;
import com.gto.zhanghui.entity.ZhAttendTypeEntity;
import com.gto.zhanghui.service.ZhAttendTypeService;



/**
 * 拜访类型表（一期基础数据导入  只有网点和客户）
 *
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
@RestController
@RequestMapping("api/zhanghui/v1")
@CrossOrigin
public class ZhAttendTypeController {
    @Autowired
    private ZhAttendTypeService zhAttendTypeService;

    /**
     * 列表
     */
    @RequestMapping("/listVisitType")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = zhAttendTypeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/infoVisitType/{id}")
    public R info(@PathVariable("id") Integer id){
        ZhAttendTypeEntity zhAttendType = zhAttendTypeService.selectById(id);

        return R.ok().put("zhAttendType", zhAttendType);
    }

    /**
     * 保存
     */
    @RequestMapping("/saveVisitType")
    public R save(@RequestBody ZhAttendTypeEntity zhAttendType){
        zhAttendTypeService.insert(zhAttendType);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/updateVisitType")
    public R update(@RequestBody ZhAttendTypeEntity zhAttendType){
        ValidatorUtils.validateEntity(zhAttendType);
        zhAttendTypeService.updateAllColumnById(zhAttendType);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/deleteVisitType")
    public R delete(@RequestBody Integer[] ids){
        zhAttendTypeService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
