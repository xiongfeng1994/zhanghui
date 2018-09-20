package com.gto.zhanghui.dao;

import com.gto.zhanghui.entity.ZhWorkLogEntity;
import com.gto.zhanghui.response.WorkLogCollect;
import com.gto.zhanghui.response.WorkLogDetail;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * 工作日志
 * 
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
public interface ZhWorkLogDao extends BaseMapper<ZhWorkLogEntity> {
	
	List<WorkLogCollect> selectWorkLogCollect(@Param("groupCode") String groupCode,
											  @Param("empCode") String empCode,
											  @Param("startTime") String startTime,
											  @Param("endTime") String endTime,
											  @Param("limit") int limit,
											  @Param("offset") int offset);
	
	int selectWorkLogCollectCount(@Param("groupCode") String groupCode,
								  @Param("empCode") String empCode,
								  @Param("startTime") String startTime,
								  @Param("endTime") String endTime);
	
	List<WorkLogDetail> selectWorkLogDetail(@Param("id") String id,
											@Param("startTime") String startTime,
											@Param("endTime") String endTime,
											@Param("limit") int limit,
											 @Param("offset") int offset);
	
	int selectWorkLogDetailCount(@Param("id") String id,
								@Param("startTime") String startTime,
								@Param("endTime") String endTime);
}
