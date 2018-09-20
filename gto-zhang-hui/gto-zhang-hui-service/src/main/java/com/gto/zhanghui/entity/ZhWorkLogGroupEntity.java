package com.gto.zhanghui.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 工作日志组
 * 
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
@TableName("zh_work_log_group")
public class ZhWorkLogGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 组ID，用户表加一个所属组GroupID
	 */
	@TableId
	private Integer id;
	/**
	 * 组名
	 */
	private String groupName;
	/**
	 * 组长
	 */
	private String groupLeader;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 组成员(account1,account1,account1)
	 */
	private String allUserName;
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
	 * 是否删除  0未删除 1已经删除
	 */
	private Integer isDelete;
	
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
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
	 * 设置：组名
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	/**
	 * 获取：组名
	 */
	public String getGroupName() {
		return groupName;
	}
	/**
	 * 设置：组长
	 */
	public void setGroupLeader(String groupLeader) {
		this.groupLeader = groupLeader;
	}
	/**
	 * 获取：组长
	 */
	public String getGroupLeader() {
		return groupLeader;
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
	 * 设置：组成员(account1,account1,account1)
	 */
	public void setAllUserName(String allUserName) {
		this.allUserName = allUserName;
	}
	/**
	 * 获取：组成员(account1,account1,account1)
	 */
	public String getAllUserName() {
		return allUserName;
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
