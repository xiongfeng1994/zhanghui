package com.gto.zhanghui.service;

import com.baomidou.mybatisplus.service.IService;
import com.gto.common.utils.R;
import com.gto.zhanghui.request.NoticeMessage;

public interface ZhPushNoticeService extends IService<NoticeMessage> {

	/**
	 * 推送给设备标识参数的用户
	 * 
	 * @param registrationId     设备标识
	 * @param notification_title 通知内容标题
	 * @param msg_title          消息内容标题
	 * @param msg_content        消息内容
	 * @param extrasparam        扩展字段
	 * @return 0推送失败，1推送成功
	 */
	public int sendToRegistrationId(String registrationId, String notification_title,
			String msg_title, String msg_content, NoticeMessage extrasparam);

	/**
	 * 发送给所有安卓用户
	 * 
	 * @param notification_title 通知内容标题
	 * @param msg_title          消息内容标题
	 * @param msg_content        消息内容
	 * @param extrasparam        扩展字段
	 * @return 0推送失败，1推送成功
	 */
	public int sendToAllAndroid(String notification_title, String msg_title, String msg_content,
			NoticeMessage extrasparam);

	/**
	 * 发送给所有IOS用户
	 * 
	 * @param notification_title 通知内容标题
	 * @param msg_title          消息内容标题
	 * @param msg_content        消息内容
	 * @param extrasparam        扩展字段
	 * @return 0推送失败，1推送成功
	 */
	public int sendToAllIos(String notification_title, String msg_title, String msg_content,
			NoticeMessage extrasparam);
	
	public R saveNoticeMessage(NoticeMessage noticeMessage);
}
