package com.gto.zhanghui.response;

public class WorkLogCollect {

	private String groupName;
	private String createTime;
	private String shouldSubNum;
	private String actualSubNum;
	private String unsubNum;
	private String id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getShouldSubNum() {
		return shouldSubNum;
	}
	public void setShouldSubNum(String shouldSubNum) {
		this.shouldSubNum = shouldSubNum;
	}
	public String getActualSubNum() {
		return actualSubNum;
	}
	public void setActualSubNum(String actualSubNum) {
		this.actualSubNum = actualSubNum;
	}
	public String getUnsubNum() {
		return unsubNum;
	}
	public void setUnsubNum(String unsubNum) {
		this.unsubNum = unsubNum;
	}
	
	
}
