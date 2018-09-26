package com.gto.zhanghui.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
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
import com.gto.zhanghui.cache.RedisCacheUtil;
import com.gto.zhanghui.entity.ZhUsersEntity;
import com.gto.zhanghui.response.UserGroup;
import com.gto.zhanghui.service.ZhUsersService;

import io.swagger.annotations.ApiOperation;



/**
 * 用户表
 *
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
@RestController
@RequestMapping("api/zhanghui/v1")
@CrossOrigin
public class ZhUsersController {
    @Autowired
    private ZhUsersService zhUsersService;

    @GetMapping("/user-query")
    @ApiOperation(value = "根据员工姓名查询")
    public R userQuery(@RequestParam(required = false) String empName) {
    	if(StringUtils.isBlank(empName)) {
    		return R.error("请输入员工姓名");
    	}
    	List<UserGroup> userGroups = zhUsersService.selectUserGroup(empName);
    	return R.ok().put("data", userGroups);
    }
    
    /**
     * 列表
     */
    @RequestMapping("/listUser")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = zhUsersService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/infoUser/{id}")
    public R info(@PathVariable("id") Integer id){
        ZhUsersEntity zhUsers = zhUsersService.selectById(id);

        return R.ok().put("zhUsers", zhUsers);
    }

    /**
     * 保存
     */
    @RequestMapping("/saveUser")
    public R save(@RequestBody ZhUsersEntity zhUsers){
        zhUsersService.insert(zhUsers);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/updateUser")
    public R update(@RequestBody ZhUsersEntity zhUsers){
        ValidatorUtils.validateEntity(zhUsers);
        zhUsersService.updateAllColumnById(zhUsers);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/deleteUser")
    public R delete(@RequestBody Integer[] ids){
        zhUsersService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
