package com.gto.zhanghui.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gto.common.utils.R;
import com.gto.zhanghui.request.NoticeMessage;

import io.swagger.annotations.ApiOperation;

/**
 * 	推送公告
 * @author Lenovo
 *
 */
@RestController
@RequestMapping("api/zhanghui/v1")
@CrossOrigin
public class ZhPushNoticeController {

	@PostMapping("/push-notice")
	@ApiOperation(value = "推送广告")
	public R pushNotice(@RequestBody NoticeMessage noticeMessage) {
		
		return null;
	}
}
