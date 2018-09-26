package com.gto.zhanghui.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gto.common.utils.R;
import com.gto.zhanghui.cache.RedisCacheUtil;
import com.gto.zhanghui.service.ZhAdminUserService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("api/zhanghui/v1")
@CrossOrigin
public class ZhAdminUserController {

	@Autowired
	ZhAdminUserService zhAdminUserService;
	
	@GetMapping("/login")
    @ApiOperation(value = "登陆")
    public R login(@RequestParam String account,@RequestParam String password) {
    	R result  = zhAdminUserService.login(account, password);
    	return result;
    }
	
	@GetMapping("/logout")
    @ApiOperation(value = "登出")
    public R logout(HttpServletRequest request) {
    	String authorization = request.getHeader("Authorization");
    	String token = RedisCacheUtil.get(authorization);
    	if(StringUtils.isBlank(token)) {
    		return R.error(500, "登陆超时");
    	}
    	RedisCacheUtil.del(authorization);
    	String flag = RedisCacheUtil.get(authorization);
    	if(StringUtils.isBlank(flag)) {
    		return R.ok();
    	}
    	return R.error();
    }
}
