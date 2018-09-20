package com.gto.zhanghui.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 * 
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
@TableName("zh_users")
public class ZhUsersEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 组ID，用户表加一个所属组GroupID
	 */
	@TableId
	private Integer id;
	/**
	 * 账号（员工工号）
	 */
	private String account;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 真实姓名
	 */
	private String realName;
	/**
	 * 手机号码
	 */
	private String phone;
	/**
	 * 生日
	 */
	private Date birthday;
	/**
	 * 邮箱
	 */
	private String mail;
	/**
	 * 昵称
	 */
	private String nickName;
	/**
	 * 男就是男，女就是女，不用其他标识代替
	 */
	private String sex;
	/**
	 * 头像地址
	 */
	private String headPhone;
	/**
	 * 入职时间
	 */
	private Date inTime;
	/**
	 * 地区
	 */
	private String region;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 状态  1可用  2禁用
	 */
	private Integer state;
	/**
	 * 所属网点编号
	 */
	private String stationId;
	/**
	 * 所属日志分组组ID
	 */
	private Integer groupId;
	/**
	 * 创建人编号
	 */
	private String createUserCode;
	/**
	 * 创建人姓名
	 */
	private String createUserName;
	/**
	 * 创建时间
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
	 * 设置：组ID，用户表加一个所属组GroupID
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：组ID，用户表加一个所属组GroupID
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：账号（员工工号）
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	/**
	 * 获取：账号（员工工号）
	 */
	public String getAccount() {
		return account;
	}
	/**
	 * 设置：密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：密码
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：真实姓名
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}
	/**
	 * 获取：真实姓名
	 */
	public String getRealName() {
		return realName;
	}
	/**
	 * 设置：手机号码
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：手机号码
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：生日
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * 获取：生日
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * 设置：邮箱
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * 获取：邮箱
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * 设置：昵称
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	/**
	 * 获取：昵称
	 */
	public String getNickName() {
		return nickName;
	}
	/**
	 * 设置：男就是男，女就是女，不用其他标识代替
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 获取：男就是男，女就是女，不用其他标识代替
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * 设置：头像地址
	 */
	public void setHeadPhone(String headPhone) {
		this.headPhone = headPhone;
	}
	/**
	 * 获取：头像地址
	 */
	public String getHeadPhone() {
		return headPhone;
	}
	/**
	 * 设置：入职时间
	 */
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}
	/**
	 * 获取：入职时间
	 */
	public Date getInTime() {
		return inTime;
	}
	/**
	 * 设置：地区
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/**
	 * 获取：地区
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * 设置：更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：状态  1可用  2禁用
	 */
	public void setState(Integer state) {
		this.state = state;
	}
	/**
	 * 获取：状态  1可用  2禁用
	 */
	public Integer getState() {
		return state;
	}
	/**
	 * 设置：所属网点编号
	 */
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	/**
	 * 获取：所属网点编号
	 */
	public String getStationId() {
		return stationId;
	}
	/**
	 * 设置：所属日志分组组ID
	 */
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	/**
	 * 获取：所属日志分组组ID
	 */
	public Integer getGroupId() {
		return groupId;
	}
	/**
	 * 设置：创建人编号
	 */
	public void setCreateUserCode(String createUserCode) {
		this.createUserCode = createUserCode;
	}
	/**
	 * 获取：创建人编号
	 */
	public String getCreateUserCode() {
		return createUserCode;
	}
	/**
	 * 设置：创建人姓名
	 */
	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}
	/**
	 * 获取：创建人姓名
	 */
	public String getCreateUserName() {
		return createUserName;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
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
}
