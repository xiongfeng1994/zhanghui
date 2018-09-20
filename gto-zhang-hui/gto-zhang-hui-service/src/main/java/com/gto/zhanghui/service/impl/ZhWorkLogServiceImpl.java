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
import com.gto.zhanghui.dao.ZhWorkLogDao;
import com.gto.zhanghui.entity.ZhWorkLogEntity;
import com.gto.zhanghui.response.WorkLogCollect;
import com.gto.zhanghui.response.WorkLogDetail;
import com.gto.zhanghui.service.ZhWorkLogService;


@Service("zhWorkLogService")
public class ZhWorkLogServiceImpl extends ServiceImpl<ZhWorkLogDao, ZhWorkLogEntity> implements ZhWorkLogService {

	@Autowired
	ZhWorkLogDao zhWorkLogDao;
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhWorkLogEntity> page = this.selectPage(
                new Query<ZhWorkLogEntity>(params).getPage(),
                new EntityWrapper<ZhWorkLogEntity>()
        );

        return new PageUtils(page);
    }

	@Override
	public List<WorkLogCollect> selectWorkLogCollect(String groupCode, String empCode, String startTime,
			String endTime,int limit,int offset) {
		List<WorkLogCollect> workLogCollects = zhWorkLogDao.selectWorkLogCollect(groupCode, empCode, startTime, endTime,limit,offset);
		return workLogCollects;
	}
	
	@Override
	public int selectWorkLogCollectCount(String groupCode, String empCode, String startTime, String endTime) {
		int count = zhWorkLogDao.selectWorkLogCollectCount(groupCode, empCode, startTime, endTime);
		return count;
	}

	@Override
	public List<WorkLogDetail> selectWorkLogDetail(String id, String startTime, String endTime,int limit,int offset) {
		List<WorkLogDetail> workLogDetails = zhWorkLogDao.selectWorkLogDetail(id, startTime, endTime,limit,offset);
		return workLogDetails;
	}

	@Override
	public int selectWorkLogDetailCount(String id, String startTime, String endTime) {
		int count = zhWorkLogDao.selectWorkLogDetailCount(id, startTime, endTime);
		return count;
	}

}
