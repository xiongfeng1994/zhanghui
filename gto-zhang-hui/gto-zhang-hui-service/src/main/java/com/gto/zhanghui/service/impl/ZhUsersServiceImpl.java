package com.gto.zhanghui.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gto.common.utils.PageUtils;
import com.gto.common.utils.Query;
import com.gto.zhanghui.dao.ZhUsersDao;
import com.gto.zhanghui.entity.ZhUsersEntity;
import com.gto.zhanghui.response.UserGroup;
import com.gto.zhanghui.service.ZhUsersService;


@Service("zhUsersService")
public class ZhUsersServiceImpl extends ServiceImpl<ZhUsersDao, ZhUsersEntity> implements ZhUsersService {

	@Autowired
	ZhUsersDao zhUsersDao;
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhUsersEntity> page = this.selectPage(
                new Query<ZhUsersEntity>(params).getPage(),
                new EntityWrapper<ZhUsersEntity>()
        );

        return new PageUtils(page);
    }

	@Override
	public PageUtils queryPageByUserName(String empName) {
		Page<ZhUsersEntity> zPage = this.selectPage(
				new Page<>(1, 100000),
				new EntityWrapper<ZhUsersEntity>().eq("nick_name", empName));
		
		return new PageUtils(zPage);
	}

	@Override
	public List<UserGroup> selectUserGroup(String userName) {
		List<UserGroup> userGroups = zhUsersDao.selectUserGroup(userName);
		return userGroups;
	}

}
