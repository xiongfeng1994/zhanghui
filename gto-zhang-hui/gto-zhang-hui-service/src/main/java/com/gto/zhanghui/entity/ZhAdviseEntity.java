package com.gto.zhanghui.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 反馈建议表
 * 
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
@TableName("zh_advise")
public class ZhAdviseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 组ID，用户表加一个所属组GroupID
	 */
	@TableId
	private Integer id;
	/**
	 * 反馈类型（1功能建议 2性能问题 3故障报修）
	 */
	private Integer adviseType;
	/**
	 * 反馈详细
	 */
	private String adviseDetail;
	/**
	 * 联系电话
	 */
	private String phone;
	/**
	 * 联系QQ
	 */
	private String qqNum;
	/**
	 * 
	 */
	private String imgUrl;
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
	 * 设置：反馈类型（1功能建议 2性能问题 3故障报修）
	 */
	public void setAdviseType(Integer adviseType) {
		this.adviseType = adviseType;
	}
	/**
	 * 获取：反馈类型（1功能建议 2性能问题 3故障报修）
	 */
	public Integer getAdviseType() {
		return adviseType;
	}
	/**
	 * 设置：反馈详细
	 */
	public void setAdviseDetail(String adviseDetail) {
		this.adviseDetail = adviseDetail;
	}
	/**
	 * 获取：反馈详细
	 */
	public String getAdviseDetail() {
		return adviseDetail;
	}
	/**
	 * 设置：联系电话
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：联系电话
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：联系QQ
	 */
	public void setQqNum(String qqNum) {
		this.qqNum = qqNum;
	}
	/**
	 * 获取：联系QQ
	 */
	public String getQqNum() {
		return qqNum;
	}
	/**
	 * 设置：
	 */
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	/**
	 * 获取：
	 */
	public String getImgUrl() {
		return imgUrl;
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
