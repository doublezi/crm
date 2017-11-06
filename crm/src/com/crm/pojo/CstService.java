package com.crm.pojo;

import java.util.Date;
/**
 * 客户服务
 * @Description TODO
 * @author 隔壁老王
 * @date 2017年7月18日 下午2:38:09
 *
 * @version
 */
public class CstService {
	
	//.基本属性
	private long svrId;//主键
	private String svrType;//服务类型
	private String svrTitle;//服务概要
	private String svrStatus;//服务状态（新创建/已分配/已处理/已归档）
	private String svrRequest;//服务请求
	private long svrCreateId;//服务创建人编号（客户经理）
	private String svrCreateName;//服务创建人名字
	private Date svrCreateDate;//服务创建时间
	private long svrDueId;//服务分配给的人编号
	private String svrDueName;//服务分配给的人姓名
	private Date svrDueDate;//服务分配时间
	private String svrDeal;//服务处理
	private long svrDealId;//服务处理人编号
	private String svrDealName;//服务处理人姓名
	private Date svrDealDate;//服务处理时间
	private String svrResult;//服务处理结果
	private int svrSatisfy;//服务满意度

	//.关联属性
	private CstCustomer cstCustomer;
	public CstCustomer getCstCustomer() {return cstCustomer;}
	public void setCstCustomer(CstCustomer cstCustomer) {this.cstCustomer = cstCustomer;}
	
	//.getter/setter
	public long getSvrId() {
		return svrId;
	}
	public void setSvrId(long svrId) {
		this.svrId = svrId;
	}
	public String getSvrType() {
		return svrType;
	}
	public void setSvrType(String svrType) {
		this.svrType = svrType;
	}
	public String getSvrTitle() {
		return svrTitle;
	}
	public void setSvrTitle(String svrTitle) {
		this.svrTitle = svrTitle;
	}
	public String getSvrStatus() {
		return svrStatus;
	}
	public void setSvrStatus(String svrStatus) {
		this.svrStatus = svrStatus;
	}
	public String getSvrRequest() {
		return svrRequest;
	}
	public void setSvrRequest(String svrRequest) {
		this.svrRequest = svrRequest;
	}
	public long getSvrCreateId() {
		return svrCreateId;
	}
	public void setSvrCreateId(long svrCreateId) {
		this.svrCreateId = svrCreateId;
	}
	public String getSvrCreateName() {
		return svrCreateName;
	}
	public void setSvrCreateName(String svrCreateName) {
		this.svrCreateName = svrCreateName;
	}
	public Date getSvrCreateDate() {
		return svrCreateDate;
	}
	public void setSvrCreateDate(Date svrCreateDate) {
		this.svrCreateDate = svrCreateDate;
	}
	public long getSvrDueId() {
		return svrDueId;
	}
	public void setSvrDueId(long svrDueId) {
		this.svrDueId = svrDueId;
	}
	public String getSvrDueName() {
		return svrDueName;
	}
	public void setSvrDueName(String svrDueName) {
		this.svrDueName = svrDueName;
	}
	public Date getSvrDueDate() {
		return svrDueDate;
	}
	public void setSvrDueDate(Date svrDueDate) {
		this.svrDueDate = svrDueDate;
	}
	public String getSvrDeal() {
		return svrDeal;
	}
	public void setSvrDeal(String svrDeal) {
		this.svrDeal = svrDeal;
	}
	public long getSvrDealId() {
		return svrDealId;
	}
	public void setSvrDealId(long svrDealId) {
		this.svrDealId = svrDealId;
	}
	public String getSvrDealName() {
		return svrDealName;
	}
	public void setSvrDealName(String svrDealName) {
		this.svrDealName = svrDealName;
	}
	public Date getSvrDealDate() {
		return svrDealDate;
	}
	public void setSvrDealDate(Date svrDealDate) {
		this.svrDealDate = svrDealDate;
	}
	public String getSvrResult() {
		return svrResult;
	}
	public void setSvrResult(String svrResult) {
		this.svrResult = svrResult;
	}
	public int getSvrSatisfy() {
		return svrSatisfy;
	}
	public void setSvrSatisfy(int svrSatisfy) {
		this.svrSatisfy = svrSatisfy;
	}
	
	
	
}
