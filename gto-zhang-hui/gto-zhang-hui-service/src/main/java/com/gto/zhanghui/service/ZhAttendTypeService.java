package com.gto.zhanghui.service;

import com.baomidou.mybatisplus.service.IService;
import com.gto.common.utils.PageUtils;
import com.gto.zhanghui.entity.ZhAttendTypeEntity;

import java.util.Map;

/**
 * 拜访类型表（一期基础数据导入  只有网点和客户）
 *
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
public interface ZhAttendTypeService extends IService<ZhAttendTypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

