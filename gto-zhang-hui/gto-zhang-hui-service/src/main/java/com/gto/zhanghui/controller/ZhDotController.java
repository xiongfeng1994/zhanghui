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
import com.gto.zhanghui.entity.ZhDotEntity;
import com.gto.zhanghui.service.ZhDotService;



/**
 * 网点
 *
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
@RestController
@RequestMapping("api/zhanghui/v1")
@CrossOrigin
public class ZhDotController {
    @Autowired
    private ZhDotService zhDotService;

    /**
     * 列表
     */
    @RequestMapping("/listDot")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = zhDotService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/infoDot/{id}")
    public R info(@PathVariable("id") Integer id){
        ZhDotEntity zhDot = zhDotService.selectById(id);

        return R.ok().put("zhDot", zhDot);
    }

    /**
     * 保存
     */
    @RequestMapping("/saveDot")
    public R save(@RequestBody ZhDotEntity zhDot){
        zhDotService.insert(zhDot);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/updateDot")
    public R update(@RequestBody ZhDotEntity zhDot){
        ValidatorUtils.validateEntity(zhDot);
        zhDotService.updateAllColumnById(zhDot);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/deleteDot")
    public R delete(@RequestBody Integer[] ids){
        zhDotService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
