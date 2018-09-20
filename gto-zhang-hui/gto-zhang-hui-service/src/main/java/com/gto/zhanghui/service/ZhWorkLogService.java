package com.gto.zhanghui.service;

import com.baomidou.mybatisplus.service.IService;
import com.gto.common.utils.PageUtils;
import com.gto.zhanghui.entity.ZhWorkLogEntity;
import com.gto.zhanghui.response.WorkLogCollect;
import com.gto.zhanghui.response.WorkLogDetail;

import java.util.List;
import java.util.Map;


/**
 * 工作日志
 *
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
public interface ZhWorkLogService extends IService<ZhWorkLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
    List<WorkLogCollect> selectWorkLogCollect(String groupCode,String empCode,String startTime,String endTime,int limit,int offset);
    
    int selectWorkLogCollectCount(String groupCode,String empCode,String startTime,String endTime);
    
    List<WorkLogDetail> selectWorkLogDetail(String id,String startTime,String endTime,int limit,int offset);
    
    int selectWorkLogDetailCount(String id,String startTime,String endTime);
}

