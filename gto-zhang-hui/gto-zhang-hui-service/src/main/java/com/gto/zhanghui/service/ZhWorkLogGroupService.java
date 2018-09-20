package com.gto.zhanghui.service;

import com.baomidou.mybatisplus.service.IService;
import com.gto.common.utils.PageUtils;
import com.gto.zhanghui.entity.ZhWorkLogGroupEntity;

import java.util.Map;

/**
 * 工作日志组
 *
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
public interface ZhWorkLogGroupService extends IService<ZhWorkLogGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
    Integer deleteLogGroup(String id);
    
    PageUtils queryLogGroup(String groupName,String groupLeader,String allUserName,String remark,int limit,int offset);
}

