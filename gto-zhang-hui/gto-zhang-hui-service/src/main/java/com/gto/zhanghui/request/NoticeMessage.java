package com.gto.zhanghui.request;

import com.baomidou.mybatisplus.annotations.TableName;

@TableName("zh_notice_msg")
public class NoticeMessage {

	private String msgId;
	private String msgPublishTime;
	private String msgType;
	private String msgInfoType;
	private String msgInfoTitle;
	private String msgInfoDetails;
	private String msgInfoPublishMan;
	private String msgInfoPublishTime;
	
	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	public String getMsgPublishTime() {
		return msgPublishTime;
	}
	public void setMsgPublishTime(String msgPublishTime) {
		this.msgPublishTime = msgPublishTime;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getMsgInfoType() {
		return msgInfoType;
	}
	public void setMsgInfoType(String msgInfoType) {
		this.msgInfoType = msgInfoType;
	}
	public String getMsgInfoTitle() {
		return msgInfoTitle;
	}
	public void setMsgInfoTitle(String msgInfoTitle) {
		this.msgInfoTitle = msgInfoTitle;
	}
	public String getMsgInfoDetails() {
		return msgInfoDetails;
	}
	public void setMsgInfoDetails(String msgInfoDetails) {
		this.msgInfoDetails = msgInfoDetails;
	}
	public String getMsgInfoPublishMan() {
		return msgInfoPublishMan;
	}
	public void setMsgInfoPublishMan(String msgInfoPublishMan) {
		this.msgInfoPublishMan = msgInfoPublishMan;
	}
	public String getMsgInfoPublishTime() {
		return msgInfoPublishTime;
	}
	public void setMsgInfoPublishTime(String msgInfoPublishTime) {
		this.msgInfoPublishTime = msgInfoPublishTime;
	}
	
	
	
}
