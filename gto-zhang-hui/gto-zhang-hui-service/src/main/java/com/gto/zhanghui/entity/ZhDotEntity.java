package com.gto.zhanghui.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 网点
 * 
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
@TableName("zh_dot")
public class ZhDotEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 组ID，用户表加一个所属组GroupID
	 */
	@TableId
	private Integer id;
	/**
	 * 网点编码
	 */
	private String dotNum;
	/**
	 * 网点名称
	 */
	private String dotName;
	/**
	 * 
	 */
	private Integer level;
	/**
	 * 
	 */
	private String parentNum;
	/**
	 * 备注
	 */
	private String remark;
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
	 * 更新时间
	 */
	private Date updateTime;

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
	 * 设置：网点编码
	 */
	public void setDotNum(String dotNum) {
		this.dotNum = dotNum;
	}
	/**
	 * 获取：网点编码
	 */
	public String getDotNum() {
		return dotNum;
	}
	/**
	 * 设置：网点名称
	 */
	public void setDotName(String dotName) {
		this.dotName = dotName;
	}
	/**
	 * 获取：网点名称
	 */
	public String getDotName() {
		return dotName;
	}
	/**
	 * 设置：
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}
	/**
	 * 获取：
	 */
	public Integer getLevel() {
		return level;
	}
	/**
	 * 设置：
	 */
	public void setParentNum(String parentNum) {
		this.parentNum = parentNum;
	}
	/**
	 * 获取：
	 */
	public String getParentNum() {
		return parentNum;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
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
}
