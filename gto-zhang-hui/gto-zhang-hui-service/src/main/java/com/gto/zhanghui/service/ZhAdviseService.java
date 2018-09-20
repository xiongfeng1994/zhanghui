package com.gto.zhanghui.service;

import com.baomidou.mybatisplus.service.IService;
import com.gto.common.utils.PageUtils;
import com.gto.zhanghui.entity.ZhAdviseEntity;

import java.util.Map;

/**
 * 反馈建议表
 *
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
public interface ZhAdviseService extends IService<ZhAdviseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

