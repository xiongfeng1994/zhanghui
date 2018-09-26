package com.gto.zhanghui.dao;

import com.gto.zhanghui.entity.ZhUsersEntity;
import com.gto.zhanghui.response.UserGroup;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * 用户表
 * 
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
public interface ZhUsersDao extends BaseMapper<ZhUsersEntity> {
	
	List<UserGroup> selectUserGroup(@Param("userName") String userName);
}
