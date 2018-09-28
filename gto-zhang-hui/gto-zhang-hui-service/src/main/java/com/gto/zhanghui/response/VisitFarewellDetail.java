package com.gto.zhanghui.response;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class VisitFarewellDetail {

	@Excel(name = "拜访对象", orderNum = "0")
	private String visitors;
	@Excel(name = "员工姓名", orderNum = "1")
	private String nickName;
	@Excel(name = "员工编号", orderNum = "2")
	private String account;
	@Excel(name = "网点名称", orderNum = "3")
	private String dotName;
	@Excel(name = "网点编号", orderNum = "4")
	private String dotNum;
	@Excel(name = "拜访位置", orderNum = "5")
	private String signAddress;
	@Excel(name = "拜访类型", orderNum = "6")
	private String typeName;
	@Excel(name = "主要事宜", orderNum = "7")
	private String content;
	@Excel(name = "备注", orderNum = "8")
	private String signRemark;
	@Excel(name = "所属省份", orderNum = "9")
	private String province;
	@Excel(name = "拜访时间", orderNum = "10")
	private String signTime;
	@Excel(name = "拜访上传时间", orderNum = "11")
	private String createTime;
	@Excel(name = "拜访结果", orderNum = "12")
	private String result;
	@Excel(name = "拜别时间", orderNum = "13")
	private String endTime;
	@Excel(name = "拜别上传时间", orderNum = "14")
	private String updateTime;
	@Excel(name = "地址1", orderNum = "15")
	private String url1;
	@Excel(name = "地址2", orderNum = "16")
	private String url2;
	
	public VisitFarewellDetail() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getUrl1() {
		return url1;
	}
	public void setUrl1(String url1) {
		this.url1 = url1;
	}
	public String getUrl2() {
		return url2;
	}
	public void setUrl2(String url2) {
		this.url2 = url2;
	}
	public String getVisitors() {
		return visitors;
	}
	public void setVisitors(String visitors) {
		this.visitors = visitors;
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
	public String getSignAddress() {
		return signAddress;
	}
	public void setSignAddress(String signAddress) {
		this.signAddress = signAddress;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSignRemark() {
		return signRemark;
	}
	public void setSignRemark(String signRemark) {
		this.signRemark = signRemark;
	}
	public String getSignTime() {
		return signTime;
	}
	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
	
	
}
