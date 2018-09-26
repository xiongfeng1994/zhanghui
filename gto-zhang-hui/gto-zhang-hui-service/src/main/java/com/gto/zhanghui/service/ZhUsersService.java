package com.gto.zhanghui.service;

import com.baomidou.mybatisplus.service.IService;
import com.gto.common.utils.PageUtils;
import com.gto.zhanghui.entity.ZhUsersEntity;
import com.gto.zhanghui.response.UserGroup;

import java.util.List;
import java.util.Map;

/**
 * 用户表
 *
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
public interface ZhUsersService extends IService<ZhUsersEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
    PageUtils queryPageByUserName(String empName);
    
    List<UserGroup> selectUserGroup(String userName); 
    
}

