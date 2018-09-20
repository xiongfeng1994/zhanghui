package com.gto.zhanghui.service;

import com.baomidou.mybatisplus.service.IService;
import com.gto.common.utils.PageUtils;
import com.gto.zhanghui.entity.ZhDotEntity;

import java.util.Map;

/**
 * 网点
 *
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
public interface ZhDotService extends IService<ZhDotEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

