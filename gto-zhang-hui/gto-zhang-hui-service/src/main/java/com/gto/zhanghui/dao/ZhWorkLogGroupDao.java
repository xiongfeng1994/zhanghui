package com.gto.zhanghui.dao;

import com.gto.zhanghui.entity.ZhWorkLogGroupEntity;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * 工作日志组
 * 
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
public interface ZhWorkLogGroupDao extends BaseMapper<ZhWorkLogGroupEntity> {
	
	int deleteLogGroup(List<String> list);
}
