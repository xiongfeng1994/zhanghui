package com.gto.zhanghui.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gto.common.utils.PageUtils;
import com.gto.common.utils.Query;
import com.gto.zhanghui.dao.ZhDotDao;
import com.gto.zhanghui.entity.ZhDotEntity;
import com.gto.zhanghui.service.ZhDotService;


@Service("zhDotService")
public class ZhDotServiceImpl extends ServiceImpl<ZhDotDao, ZhDotEntity> implements ZhDotService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhDotEntity> page = this.selectPage(
                new Query<ZhDotEntity>(params).getPage(),
                new EntityWrapper<ZhDotEntity>()
        );

        return new PageUtils(page);
    }

}
