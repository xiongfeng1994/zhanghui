package com.gto.zhanghui.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 工作日志
 * 
 * @author xiongfeng
 * @email xiongfeng@gto365.com
 * @date 2018-09-13 11:32:12
 */
@TableName("zh_work_log")
public class ZhWorkLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 今日工作
	 */
	private String todayWork;
	/**
	 * 明日计划
	 */
	private String tomorrowPlan;
	/**
	 * 对明天工作承诺
	 */
	private String tomorrowPromise;
	/**
	 * 今日行的通的地方
	 */
	private String todayGood;
	/**
	 * 今日待改善的地方
	 */
	private String todayBad;
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
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 最后更新人编号
	 */
	private String updateUserCode;
	/**
	 * 最后更新人姓名
	 */
	private String updateUserName;

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
	 * 设置：今日工作
	 */
	public void setTodayWork(String todayWork) {
		this.todayWork = todayWork;
	}
	/**
	 * 获取：今日工作
	 */
	public String getTodayWork() {
		return todayWork;
	}
	/**
	 * 设置：明日计划
	 */
	public void setTomorrowPlan(String tomorrowPlan) {
		this.tomorrowPlan = tomorrowPlan;
	}
	/**
	 * 获取：明日计划
	 */
	public String getTomorrowPlan() {
		return tomorrowPlan;
	}
	/**
	 * 设置：对明天工作承诺
	 */
	public void setTomorrowPromise(String tomorrowPromise) {
		this.tomorrowPromise = tomorrowPromise;
	}
	/**
	 * 获取：对明天工作承诺
	 */
	public String getTomorrowPromise() {
		return tomorrowPromise;
	}
	/**
	 * 设置：今日行的通的地方
	 */
	public void setTodayGood(String todayGood) {
		this.todayGood = todayGood;
	}
	/**
	 * 获取：今日行的通的地方
	 */
	public String getTodayGood() {
		return todayGood;
	}
	/**
	 * 设置：今日待改善的地方
	 */
	public void setTodayBad(String todayBad) {
		this.todayBad = todayBad;
	}
	/**
	 * 获取：今日待改善的地方
	 */
	public String getTodayBad() {
		return todayBad;
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
