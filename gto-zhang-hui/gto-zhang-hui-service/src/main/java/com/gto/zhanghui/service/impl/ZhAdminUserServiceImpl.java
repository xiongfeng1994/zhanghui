package com.gto.zhanghui.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gto.common.utils.R;
import com.gto.zhanghui.cache.RedisCacheUtil;
import com.gto.zhanghui.dao.ZhAdminUserDao;
import com.gto.zhanghui.entity.ZhAdminUserEntity;
import com.gto.zhanghui.service.ZhAdminUserService;

@Service("zhAdminUserService")
public class ZhAdminUserServiceImpl extends ServiceImpl<ZhAdminUserDao, ZhAdminUserEntity> implements ZhAdminUserService{

	@Override
	public R login(String account, String password) {
		List<ZhAdminUserEntity> zhAdminEntities = this.baseMapper.selectList(
												new EntityWrapper<ZhAdminUserEntity>()
												.eq("user_code", account)
												.eq("password", password));
		ZhAdminUserEntity zhEntity = zhAdminEntities.get(0);
		if(zhEntity == null) {
			return R.error("用户名或密码错误");
		}
		String token = UUID.randomUUID().toString().replace("-", "").toLowerCase();
		RedisCacheUtil.set(token, JSON.toJSON(zhEntity), 7200);
		return R.ok().put("token", token);
	}

}
