package com.gto.zhanghui.controller;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.gto.common.utils.R;
import com.gto.zhanghui.request.NoticeMessage;
import com.gto.zhanghui.service.ZhPushNoticeService;

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
	
	private static final Logger log = LoggerFactory.getLogger(ZhPushNoticeController.class);

	@Autowired
	ZhPushNoticeService zhPushNoticeService;
	
	@PostMapping("/push-notice")
	@ApiOperation(value = "推送公告")
	public R pushNotice(@RequestBody NoticeMessage noticeMessage) {
		StringBuffer sb = new StringBuffer();
		String id = UUID.randomUUID().toString().replace("-", "").toLowerCase();
		noticeMessage.setMsgId(id);
		int androidResponse = zhPushNoticeService.sendToAllAndroid("公告提醒", noticeMessage.getMsgInfoTitle(), noticeMessage.getMsgInfoDetails(), noticeMessage);
		int iosResponse = zhPushNoticeService.sendToAllIos("公告提醒", noticeMessage.getMsgInfoTitle(), noticeMessage.getMsgInfoDetails(), noticeMessage);
		if(androidResponse == 0) {
			sb.append("Android推送失败");
		} else {
			sb.append("Android推送成功");
		}
		if(iosResponse == 0) {
			sb.append("IOS推送失败");
		} else {
			sb.append("IOS推送成功");
		}
		R result =  zhPushNoticeService.saveNoticeMessage(noticeMessage);
		log.info("pushNotice>>>>>>>>>"+JSON.toJSONString(result));
		return R.ok(sb.toString());
	}
}
