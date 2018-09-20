package com.gto.zhanghui.service;

import com.baomidou.mybatisplus.service.IService;
import com.gto.common.utils.PageUtils;
import com.gto.zhanghui.entity.ZhAttendRecordsEntity;
import com.gto.zhanghui.response.VisitCollect;
import com.gto.zhanghui.response.VisitFarewellDetail;

import java.util.List;
import java.util.Map;

/**
 * 拜访记录表
 *
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
public interface ZhAttendRecordsService extends IService<ZhAttendRecordsEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
    List<VisitCollect> queryVisitCollect(String empCode,String siteCode,String startTime,String endTime,int limit,int offset);
    
    int selectVisitHistoryCount(String empCode,String siteCode,String startTime,String endTime);
    
    List<VisitFarewellDetail> queryVisitFarewellDetail(String startTime,String endTime,String account,int limit,int offset);
    
    int selectVisitCount(String startTime,String endTime,String account);
    
    List<VisitFarewellDetail> queryNoFarewellDetail(String startTime,String endTime,String account,int limit,int offset);
    
    int selectNoFarewellCount(String startTime,String endTime,String account);
}

