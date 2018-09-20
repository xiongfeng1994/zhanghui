package com.gto.zhanghui.dao;

import com.gto.zhanghui.entity.ZhAttendRecordsEntity;
import com.gto.zhanghui.response.VisitCollect;
import com.gto.zhanghui.response.VisitFarewellDetail;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * 拜访记录表
 * 
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
public interface ZhAttendRecordsDao extends BaseMapper<ZhAttendRecordsEntity> {
	
	List<VisitCollect> selectVisitHistory(@Param("empCode") String empCode,
								   		  @Param("siteCode") String siteCode,
								   		  @Param("startTime") String startTime,
								   		  @Param("endTime") String endTime,
								   		  @Param("limit") int limit,
								   		  @Param("offset") int offset);
	
	int selectVisitHistoryCount(@Param("empCode") String empCode,
					   		  @Param("siteCode") String siteCode,
					   		  @Param("startTime") String startTime,
					   		  @Param("endTime") String endTime);
	
	List<VisitFarewellDetail> selectVisit(@Param("startTime") String startTime,
										  @Param("endTime") String endTime,
										  @Param("account") String account,
										  @Param("limit") int limit,
								   		  @Param("offset") int offset);
	
	int selectVisitCount(@Param("startTime") String startTime,
						  @Param("endTime") String endTime,
						  @Param("account") String account);
	
	List<VisitFarewellDetail> selectNoFarewell(@Param("startTime") String startTime,
			  								   @Param("endTime") String endTime,
			  								   @Param("account") String account,
			  								   @Param("limit") int limit,
									   		   @Param("offset") int offset);
	
	int selectNoFarewellCount(@Param("startTime") String startTime,
			   				 @Param("endTime") String endTime,
			   				 @Param("account") String account);
}
