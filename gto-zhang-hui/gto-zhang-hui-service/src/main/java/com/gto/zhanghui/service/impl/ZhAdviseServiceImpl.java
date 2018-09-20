package com.gto.zhanghui.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gto.common.utils.PageUtils;
import com.gto.common.utils.Query;
import com.gto.zhanghui.dao.ZhAdviseDao;
import com.gto.zhanghui.entity.ZhAdviseEntity;
import com.gto.zhanghui.service.ZhAdviseService;


@Service("zhAdviseService")
public class ZhAdviseServiceImpl extends ServiceImpl<ZhAdviseDao, ZhAdviseEntity> implements ZhAdviseService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhAdviseEntity> page = this.selectPage(
                new Query<ZhAdviseEntity>(params).getPage(),
                new EntityWrapper<ZhAdviseEntity>()
        );

        return new PageUtils(page);
    }

}
