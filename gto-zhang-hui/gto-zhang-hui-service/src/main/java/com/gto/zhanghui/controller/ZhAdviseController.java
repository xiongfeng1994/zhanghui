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
import com.gto.zhanghui.entity.ZhAdviseEntity;
import com.gto.zhanghui.service.ZhAdviseService;



/**
 * 反馈建议表
 *
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
@RestController
@RequestMapping("api/zhanghui/v1")
@CrossOrigin
public class ZhAdviseController {
    @Autowired
    private ZhAdviseService zhAdviseService;

    /**
     * 列表
     */
    @RequestMapping("/listAdvise")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = zhAdviseService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/infoAdvise/{id}")
    public R info(@PathVariable("id") Integer id){
        ZhAdviseEntity zhAdvise = zhAdviseService.selectById(id);

        return R.ok().put("zhAdvise", zhAdvise);
    }

    /**
     * 保存
     */
    @RequestMapping("/saveAdvise")
    public R save(@RequestBody ZhAdviseEntity zhAdvise){
        zhAdviseService.insert(zhAdvise);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/updateAdvise")
    public R update(@RequestBody ZhAdviseEntity zhAdvise){
        ValidatorUtils.validateEntity(zhAdvise);
        zhAdviseService.updateAllColumnById(zhAdvise);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/deleteAdvise")
    public R delete(@RequestBody Integer[] ids){
        zhAdviseService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
