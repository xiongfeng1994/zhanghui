package com.gto.zhanghui.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gto.common.utils.PageUtils;
import com.gto.common.utils.Query;
import com.gto.common.utils.R;
import com.gto.zhanghui.cache.RedisCacheUtil;
import com.gto.zhanghui.dao.ZhUsersDao;
import com.gto.zhanghui.entity.ZhUsersEntity;
import com.gto.zhanghui.service.ZhUsersService;


@Service("zhUsersService")
public class ZhUsersServiceImpl extends ServiceImpl<ZhUsersDao, ZhUsersEntity> implements ZhUsersService {

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
	public R login(String account, String password) {
		List<ZhUsersEntity> zhUsersEntities = this.baseMapper.selectList(
												new EntityWrapper<ZhUsersEntity>()
												.eq("account", account)
												.eq("password", password));
		ZhUsersEntity zhEntity = zhUsersEntities.get(0);
		if(zhEntity == null) {
			return R.error("用户名或密码错误");
		}
		String token = UUID.randomUUID().toString().replace("-", "").toLowerCase();
		RedisCacheUtil.set(token, JSON.toJSON(zhEntity), 7200);
		return R.ok().put("token", token);
	}

}
