package com.gto.zhanghui.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.gto.common.utils.PageUtils;
import com.gto.common.utils.R;
import com.gto.zhanghui.cache.RedisCacheUtil;
import com.gto.zhanghui.entity.ZhUsersEntity;
import com.gto.zhanghui.entity.ZhWorkLogGroupEntity;
import com.gto.zhanghui.service.ZhUsersService;
import com.gto.zhanghui.service.ZhWorkLogGroupService;
import com.gto.zhanghui.utils.FileUtil;

import io.swagger.annotations.ApiOperation;



/**
 * 工作日志组
 *
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
@RestController
@RequestMapping("api/zhanghui/v1")
@CrossOrigin
public class ZhWorkLogGroupController {
	
	private static final Logger log = LoggerFactory.getLogger(ZhWorkLogGroupController.class);
	
    @Autowired
    private ZhWorkLogGroupService zhWorkLogGroupService;
    @Autowired
    private ZhUsersService zhUsersService;

    /**
     * 保存
     */
    @PostMapping("/log-group-add")
    @ApiOperation(value = "添加日志组")
    public R save(@RequestBody ZhWorkLogGroupEntity zhWorkLogGroup,
    			  HttpServletRequest request){
    	String authorization = request.getHeader("Authorization");
    	String value = RedisCacheUtil.get(authorization);
    	JSONObject object = JSON.parseObject(value);
    	String userCode = object.getString("userCode");
    	String userName = object.getString("userName");
    	zhWorkLogGroup.setCreateUserName(userName);
    	zhWorkLogGroup.setCreateUserCode(userCode);
    	zhWorkLogGroup.setIsDelete(0);
    	zhWorkLogGroup.setCreateTime(new Date());
        boolean result = zhWorkLogGroupService.insert(zhWorkLogGroup);
        // 更新user表groupId
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy",Locale.US);
        sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ZhWorkLogGroupEntity entity = zhWorkLogGroupService.selectOne(
        		new EntityWrapper<ZhWorkLogGroupEntity>()
        		.eq("create_time",sdf.format(zhWorkLogGroup.getCreateTime())));
       log.info("ZhWorkLogGroupEntity>>>>>>>>>>>>>"+JSON.toJSONString(entity));
       String groupLeader = zhWorkLogGroup.getGroupLeader();
       String number = FileUtil.extractNumber(groupLeader);
       ZhUsersEntity zhUsersEntity = new ZhUsersEntity();
       zhUsersEntity.setGroupId(entity.getId());
       zhUsersService.update(
    		   zhUsersEntity, 
    		   new EntityWrapper<ZhUsersEntity>()
    		   .eq("account", number));
       String allUserName = zhWorkLogGroup.getAllUserName();
       String[] name = allUserName.split(",");
       for (String string : name) {
    	   String numbers = FileUtil.extractNumber(string);
           ZhUsersEntity usersEntity = new ZhUsersEntity();
           usersEntity.setGroupId(entity.getId());
           zhUsersService.update(
        		   usersEntity, 
        		   new EntityWrapper<ZhUsersEntity>()
        		   .eq("account", numbers));
	}
        if(!result) {
        	return R.error(400, "日志组保存失败");
        }
        return R.ok();
    }
    
    /**
     * 逻辑删除
     */
    @GetMapping("/log-group-delete")
    @ApiOperation(value = "删除日志组")
    public R delete(@RequestParam String ids){
    	Integer result = zhWorkLogGroupService.deleteLogGroup(ids);
    	if(result <= 0) {
    		return R.error(400, "删除失败");
    	}
    	return R.ok();
    }
    
    /**
     * 修改
     */
    @PostMapping("/log-group-update")
    @ApiOperation(value = "修改日志组")
    public R update(@RequestBody ZhWorkLogGroupEntity zhWorkLogGroup,
    				HttpServletRequest request){
    	String authorization = request.getHeader("Authorization");
    	String value = RedisCacheUtil.get(authorization);
    	JSONObject object = JSON.parseObject(value);
    	String userCode = object.getString("userCode");
    	String userName = object.getString("userName");
    	zhWorkLogGroup.setUpdateUserCode(userCode);
    	zhWorkLogGroup.setUpdateUserName(userName);
    	zhWorkLogGroup.setUpdateTime(new Date());
    	boolean result = zhWorkLogGroupService.updateById(zhWorkLogGroup);
    	if(!result) {
    		return R.error(400, "修改失败");
    	}
    	return R.ok();
    }
    
    @GetMapping("/log-group-query")
    @ApiOperation(value = "查询日志组")
    public R logGroupQuery(@RequestParam(required = false) String groupName,
    					   @RequestParam(required = false) String groupLeader,
    					   @RequestParam(required = false) String allUserName,
    					   @RequestParam(required = false) String remark,
    					   @RequestParam(defaultValue = "1") int currPage,
						   @RequestParam(defaultValue = "10") int pageSize){
    	PageUtils page = zhWorkLogGroupService.queryLogGroup(groupName, groupLeader, allUserName, remark,currPage*pageSize-pageSize, pageSize);
    	return R.ok().put("data", page);
    }
    
    /**
     * 编辑信息
     */
    @GetMapping("/log-group-info/{id}")
    @ApiOperation(value = "编辑信息")
    public R info(@PathVariable("id") Integer id){
        ZhWorkLogGroupEntity zhWorkLogGroup = zhWorkLogGroupService.selectById(id);

        return R.ok().put("data", zhWorkLogGroup);
    }
    
    /**
     * 列表
     */
    @RequestMapping("/listLogGroup")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = zhWorkLogGroupService.queryPage(params);

        return R.ok().put("page", page);
    }

}
