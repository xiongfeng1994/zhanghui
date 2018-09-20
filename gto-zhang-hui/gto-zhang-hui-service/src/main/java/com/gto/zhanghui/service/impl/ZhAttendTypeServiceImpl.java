package com.gto.zhanghui.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.gto.common.utils.PageUtils;
import com.gto.common.utils.Query;
import com.gto.zhanghui.dao.ZhAttendTypeDao;
import com.gto.zhanghui.entity.ZhAttendTypeEntity;
import com.gto.zhanghui.service.ZhAttendTypeService;


@Service("zhAttendTypeService")
public class ZhAttendTypeServiceImpl extends ServiceImpl<ZhAttendTypeDao, ZhAttendTypeEntity> implements ZhAttendTypeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhAttendTypeEntity> page = this.selectPage(
                new Query<ZhAttendTypeEntity>(params).getPage(),
                new EntityWrapper<ZhAttendTypeEntity>()
        );

        return new PageUtils(page);
    }

}
