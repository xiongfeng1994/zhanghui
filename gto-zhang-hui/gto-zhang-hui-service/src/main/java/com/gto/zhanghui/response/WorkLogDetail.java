package com.gto.zhanghui.response;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class WorkLogDetail {

	@Excel(name = "员工姓名", orderNum = "0")
	private String nickName;
	@Excel(name = "员工编号", orderNum = "1")
	private String account;
	@Excel(name = "站点名称", orderNum = "2")
	private String dotName;
	@Excel(name = "站点编号", orderNum = "3")
	private String dotNum;
	@Excel(name = "所属组名", orderNum = "4")
	private String groupName;
	private String id;
	@Excel(name = "所属组长", orderNum = "5")
	private String groupLeader;
	@Excel(name = "今日工作", orderNum = "6")
	private String todayWork;
	@Excel(name = "行得通的是", orderNum = "7")
	private String todayGood;
	@Excel(name = "行不通的是", orderNum = "8")
	private String todayBad;
	@Excel(name = "明日计划", orderNum = "9")
	private String tomorrowPlan;
	@Excel(name = "对明天工作态度的承诺", orderNum = "10")
	private String tomorrowPromise;
	@Excel(name = "日志提交时间", orderNum = "11")
	private String createTime;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getDotName() {
		return dotName;
	}
	public void setDotName(String dotName) {
		this.dotName = dotName;
	}
	public String getDotNum() {
		return dotNum;
	}
	public void setDotNum(String dotNum) {
		this.dotNum = dotNum;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupLeader() {
		return groupLeader;
	}
	public void setGroupLeader(String groupLeader) {
		this.groupLeader = groupLeader;
	}
	public String getTodayWork() {
		return todayWork;
	}
	public void setTodayWork(String todayWork) {
		this.todayWork = todayWork;
	}
	public String getTodayGood() {
		return todayGood;
	}
	public void setTodayGood(String todayGood) {
		this.todayGood = todayGood;
	}
	public String getTodayBad() {
		return todayBad;
	}
	public void setTodayBad(String todayBad) {
		this.todayBad = todayBad;
	}
	public String getTomorrowPlan() {
		return tomorrowPlan;
	}
	public void setTomorrowPlan(String tomorrowPlan) {
		this.tomorrowPlan = tomorrowPlan;
	}
	public String getTomorrowPromise() {
		return tomorrowPromise;
	}
	public void setTomorrowPromise(String tomorrowPromise) {
		this.tomorrowPromise = tomorrowPromise;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
}
