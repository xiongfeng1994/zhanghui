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
import com.gto.zhanghui.dao.ZhAttendRecordsDao;
import com.gto.zhanghui.entity.ZhAttendRecordsEntity;
import com.gto.zhanghui.response.VisitCollect;
import com.gto.zhanghui.response.VisitFarewellDetail;
import com.gto.zhanghui.service.ZhAttendRecordsService;


@Service("zhAttendRecordsService")
public class ZhAttendRecordsServiceImpl extends ServiceImpl<ZhAttendRecordsDao, ZhAttendRecordsEntity> implements ZhAttendRecordsService {

	@Autowired
	ZhAttendRecordsDao zhAttendRecordsDao;
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhAttendRecordsEntity> page = this.selectPage(
                new Query<ZhAttendRecordsEntity>(params).getPage(),
                new EntityWrapper<ZhAttendRecordsEntity>()
        );

        return new PageUtils(page);
    }

	@Override
	public List<VisitCollect> queryVisitCollect(String empCode, String siteCode, String startTime, String endTime,String typeName,int limit,int offset) {
		List<VisitCollect> visitCollects = zhAttendRecordsDao.selectVisitHistory(empCode, siteCode, startTime, endTime, typeName, limit, offset);
		return visitCollects;
	}
	
	@Override
	public int selectVisitHistoryCount(String empCode, String siteCode, String startTime, String endTime,String typeName) {
		int count = zhAttendRecordsDao.selectVisitHistoryCount(empCode,siteCode,startTime,endTime,typeName);
		return count;
	}

	@Override
	public List<VisitFarewellDetail> queryVisitFarewellDetail(String startTime, String endTime, String account,String typeName,int limit,int offset) {
		List<VisitFarewellDetail> visitFarewellDetails = zhAttendRecordsDao.selectVisit(startTime, endTime, account,typeName,limit,offset);
		return visitFarewellDetails;
	}
	
	@Override
	public int selectVisitCount(String startTime, String endTime, String account,String typeName) {
		int count = zhAttendRecordsDao.selectVisitCount(startTime,endTime,account,typeName);
		return count;
	}

	@Override
	public List<VisitFarewellDetail> queryNoFarewellDetail(String startTime, String endTime, String account,String typeName,int limit,int offset) {
		List<VisitFarewellDetail> visitFarewellDetails = zhAttendRecordsDao.selectNoFarewell(startTime, endTime, account,typeName,limit,offset);
		return visitFarewellDetails;
	}

	@Override
	public int selectNoFarewellCount(String startTime, String endTime, String account,String typeName) {
		int count = zhAttendRecordsDao.selectNoFarewellCount(startTime, endTime, account,typeName);
		return count;
	}

}
