package com.gto.zhanghui.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gto.common.utils.PageUtils;
import com.gto.common.utils.Query;
import com.gto.zhanghui.dao.ZhWorkLogGroupDao;
import com.gto.zhanghui.entity.ZhWorkLogGroupEntity;
import com.gto.zhanghui.service.ZhWorkLogGroupService;


@Service("zhWorkLogGroupService")
public class ZhWorkLogGroupServiceImpl extends ServiceImpl<ZhWorkLogGroupDao, ZhWorkLogGroupEntity> implements ZhWorkLogGroupService {

	@Autowired
	ZhWorkLogGroupDao zhWorkLogGroupDao;
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhWorkLogGroupEntity> page = this.selectPage(
                new Query<ZhWorkLogGroupEntity>(params).getPage(),
                new EntityWrapper<ZhWorkLogGroupEntity>()
        );

        return new PageUtils(page);
    }

	@Override
	public Integer deleteLogGroup(String id) {
		List<String> list = getList(id);
		int result = zhWorkLogGroupDao.deleteLogGroup(list);
		return result;
	}
	
	public List<String> getList(String id) {
		List<String> list = new ArrayList<String>();
		String[] str = id.split(",");
		for (int i = 0; i < str.length; i++) {
			list.add(str[i]);
		}
		return list;
	}

	@Override
	public PageUtils queryLogGroup(String groupName, String groupLeader, String allUserName, String remark,int limit,int offset) {
		
		int count = this.selectCount(
						new EntityWrapper<ZhWorkLogGroupEntity>()
						.eq("is_delete", "0")
						.like("group_name", groupName)
						.like("group_leader", groupLeader)
						.like("all_user_name", allUserName)
						.like("remark", remark));
		
		Page<ZhWorkLogGroupEntity> zhPage = this.selectPage(
												new Page<>(limit, offset),
												new EntityWrapper<ZhWorkLogGroupEntity>()
												.eq("is_delete", "0")
												.like("group_name", groupName)
												.like("group_leader", groupLeader)
												.like("all_user_name", allUserName)
												.like("remark", remark));
		zhPage.setTotal(count);
		return new PageUtils(zhPage);
	}

}
