package com.gto.zhanghui.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 拜访记录表
 * 
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
@TableName("zh_attend_records")
public class ZhAttendRecordsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 拜访定位地址
	 */
	private String signAddress;
	/**
	 * 拜访类型 （一期只有网点和客户，数据关联拜访类型表）
	 */
	private Integer attendTypeId;
	/**
	 * 网点名称或者客户手机号码
	 */
	private String visitors;
	/**
	 * 拜访主要事宜
	 */
	private String content;
	/**
	 * 拜访备注
	 */
	private String signRemark;
	/**
	 * 拜访打卡时间
	 */
	private Date signTime;
	/**
	 * 图片或者视频地址1
	 */
	private String url1;
	/**
	 * 图片或者视频地址2
	 */
	private String url2;
	/**
	 * 拜别备注
	 */
	private String endRemark;
	/**
	 * 拜访结果
	 */
	private String result;
	/**
	 * 拜别打卡时间
	 */
	private Date endTime;
	/**
	 * 拜别定位地址
	 */
	private String endAddress;
	/**
	 * 创建人编号(打卡人编码)
	 */
	private String createUserCode;
	/**
	 * 创建人姓名（打卡人姓名）
	 */
	private String createUserName;
	/**
	 * 创建时间（拜访上传时间）
	 */
	private Date createTime;
	/**
	 * 最后更新人编号
	 */
	private String updateUserCode;
	/**
	 * 最后更新人姓名
	 */
	private String updateUserName;
	/**
	 * 更新时间（拜别记录时间）
	 */
	private Date updateTime;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：拜访定位地址
	 */
	public void setSignAddress(String signAddress) {
		this.signAddress = signAddress;
	}
	/**
	 * 获取：拜访定位地址
	 */
	public String getSignAddress() {
		return signAddress;
	}
	/**
	 * 设置：拜访类型 （一期只有网点和客户，数据关联拜访类型表）
	 */
	public void setAttendTypeId(Integer attendTypeId) {
		this.attendTypeId = attendTypeId;
	}
	/**
	 * 获取：拜访类型 （一期只有网点和客户，数据关联拜访类型表）
	 */
	public Integer getAttendTypeId() {
		return attendTypeId;
	}
	/**
	 * 设置：网点名称或者客户手机号码
	 */
	public void setVisitors(String visitors) {
		this.visitors = visitors;
	}
	/**
	 * 获取：网点名称或者客户手机号码
	 */
	public String getVisitors() {
		return visitors;
	}
	/**
	 * 设置：拜访主要事宜
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：拜访主要事宜
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：拜访备注
	 */
	public void setSignRemark(String signRemark) {
		this.signRemark = signRemark;
	}
	/**
	 * 获取：拜访备注
	 */
	public String getSignRemark() {
		return signRemark;
	}
	/**
	 * 设置：拜访打卡时间
	 */
	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}
	/**
	 * 获取：拜访打卡时间
	 */
	public Date getSignTime() {
		return signTime;
	}
	/**
	 * 设置：图片或者视频地址1
	 */
	public void setUrl1(String url1) {
		this.url1 = url1;
	}
	/**
	 * 获取：图片或者视频地址1
	 */
	public String getUrl1() {
		return url1;
	}
	/**
	 * 设置：图片或者视频地址2
	 */
	public void setUrl2(String url2) {
		this.url2 = url2;
	}
	/**
	 * 获取：图片或者视频地址2
	 */
	public String getUrl2() {
		return url2;
	}
	/**
	 * 设置：拜别备注
	 */
	public void setEndRemark(String endRemark) {
		this.endRemark = endRemark;
	}
	/**
	 * 获取：拜别备注
	 */
	public String getEndRemark() {
		return endRemark;
	}
	/**
	 * 设置：拜访结果
	 */
	public void setResult(String result) {
		this.result = result;
	}
	/**
	 * 获取：拜访结果
	 */
	public String getResult() {
		return result;
	}
	/**
	 * 设置：拜别打卡时间
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	/**
	 * 获取：拜别打卡时间
	 */
	public Date getEndTime() {
		return endTime;
	}
	/**
	 * 设置：拜别定位地址
	 */
	public void setEndAddress(String endAddress) {
		this.endAddress = endAddress;
	}
	/**
	 * 获取：拜别定位地址
	 */
	public String getEndAddress() {
		return endAddress;
	}
	/**
	 * 设置：创建人编号(打卡人编码)
	 */
	public void setCreateUserCode(String createUserCode) {
		this.createUserCode = createUserCode;
	}
	/**
	 * 获取：创建人编号(打卡人编码)
	 */
	public String getCreateUserCode() {
		return createUserCode;
	}
	/**
	 * 设置：创建人姓名（打卡人姓名）
	 */
	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}
	/**
	 * 获取：创建人姓名（打卡人姓名）
	 */
	public String getCreateUserName() {
		return createUserName;
	}
	/**
	 * 设置：创建时间（拜访上传时间）
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间（拜访上传时间）
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：最后更新人编号
	 */
	public void setUpdateUserCode(String updateUserCode) {
		this.updateUserCode = updateUserCode;
	}
	/**
	 * 获取：最后更新人编号
	 */
	public String getUpdateUserCode() {
		return updateUserCode;
	}
	/**
	 * 设置：最后更新人姓名
	 */
	public void setUpdateUserName(String updateUserName) {
		this.updateUserName = updateUserName;
	}
	/**
	 * 获取：最后更新人姓名
	 */
	public String getUpdateUserName() {
		return updateUserName;
	}
	/**
	 * 设置：更新时间（拜别记录时间）
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：更新时间（拜别记录时间）
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
}
