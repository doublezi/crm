package com.crm.pojo;

import java.util.Date;

/**
 * 销售机会
 * @Description 
 * 提供与销售机会相关的所有属性</br>提供{@code getter/setter}方法。
 * @author 隔壁老王
 * @date 2017年7月18日 下午3:36:07
 *
 * @version
 */
public class SalChance {
	
	private long chcId;//主键(not null)
	private String chcSource;//机会来源
	private String chcCustName;//客户名称(not null)
	private String chcTitle;//概要(not null)
	private int chcRate;//成功机率
	private String chcLinkMan;//联系人
	private String chcTel;//联系人电话
	private String chcDesc;//机会描述(not null)
	private long chcCreateId;//创建人编号(not null)
	private String chcCreateName;//创建人姓名(not null)
	private Date chcCreateDate;//创建时间(not null)
	private long chcDueId;//指派给的人编号
	private String chcDueName;//指派给的人姓名
	private Date chcDueDate;//指派时间
	//.更：将char类型的chcStatus修改为string类型
	private String chcStatus;//销售机会状态(not null)
	//.
	private SalPlan salPlan;

	
	
	public SalPlan getSalPlan() {
		return salPlan;
	}
	public void setSalPlan(SalPlan salPlan) {
		this.salPlan = salPlan;
	}
	public long getChcId() {
		return chcId;
	}
	public void setChcId(long chcId) {
		this.chcId = chcId;
	}
	public String getChcSource() {
		return chcSource;
	}
	public void setChcSource(String chcSource) {
		this.chcSource = chcSource;
	}
	public String getChcCustName() {
		return chcCustName;
	}
	public void setChcCustName(String chcCustName) {
		this.chcCustName = chcCustName;
	}
	public String getChcTitle() {
		return chcTitle;
	}
	public void setChcTitle(String chcTitle) {
		this.chcTitle = chcTitle;
	}
	public int getChcRate() {
		return chcRate;
	}
	public void setChcRate(int chcRate) {
		this.chcRate = chcRate;
	}
	public String getChcLinkMan() {
		return chcLinkMan;
	}
	public void setChcLinkMan(String chcLinkMan) {
		this.chcLinkMan = chcLinkMan;
	}
	public String getChcTel() {
		return chcTel;
	}
	public void setChcTel(String chcTel) {
		this.chcTel = chcTel;
	}
	public String getChcDesc() {
		return chcDesc;
	}
	public void setChcDesc(String chcDesc) {
		this.chcDesc = chcDesc;
	}
	public long getChcCreateId() {
		return chcCreateId;
	}
	public void setChcCreateId(long chcCreateId) {
		this.chcCreateId = chcCreateId;
	}
	public String getChcCreateName() {
		return chcCreateName;
	}
	public void setChcCreateName(String chcCreateName) {
		this.chcCreateName = chcCreateName;
	}
	public Date getChcCreateDate() {
		return chcCreateDate;
	}
	public void setChcCreateDate(Date chcCreateDate) {
		this.chcCreateDate = chcCreateDate;
	}
	public long getChcDueId() {
		return chcDueId;
	}
	public void setChcDueId(long chcDueId) {
		this.chcDueId = chcDueId;
	}
	public String getChcDueName() {
		return chcDueName;
	}
	public void setChcDueName(String chcDueName) {
		this.chcDueName = chcDueName;
	}
	public Date getChcDueDate() {
		return chcDueDate;
	}
	public void setChcDueDate(Date chcDueDate) {
		this.chcDueDate = chcDueDate;
	}
	public String getChcStatus() {
		return chcStatus;
	}
	public void setChcStatus(String chcStatus) {
		this.chcStatus = chcStatus;
	}
	@Override
	public String toString() {
		return "SalChance [chcId=" + chcId + ", chcSource=" + chcSource + ", chcCustName=" + chcCustName + ", chcTitle="
				+ chcTitle + ", chcRate=" + chcRate + ", chcLinkMan=" + chcLinkMan + ", chcTel=" + chcTel + ", chcDesc="
				+ chcDesc + ", chcCreateId=" + chcCreateId + ", chcCreateName=" + chcCreateName + ", chcCreateDate="
				+ chcCreateDate + ", chcDueId=" + chcDueId + ", chcDueName=" + chcDueName + ", chcDueDate=" + chcDueDate
				+ ", chcStatus=" + chcStatus + "]";
	}
	
	
}
