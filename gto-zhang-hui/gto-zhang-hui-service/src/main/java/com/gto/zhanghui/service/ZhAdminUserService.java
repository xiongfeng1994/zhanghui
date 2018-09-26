package com.gto.zhanghui.service;

import com.baomidou.mybatisplus.service.IService;
import com.gto.common.utils.R;
import com.gto.zhanghui.entity.ZhAdminUserEntity;

public interface ZhAdminUserService extends IService<ZhAdminUserEntity>{

	R login(String account, String password);
}
