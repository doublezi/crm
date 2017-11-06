package com.crm.pojo;

import java.util.Date;

/**
 * 客户流失
 * @Description TODO
 * @author 隔壁老王
 * @date 2017年7月18日 下午2:08:54
 *
 * @version 1.0
 */
public class CstLost {
	
	//.基本属性
	private long LstId;//主键
	private long LstCustManagerId;//使用者编号
	private String LstCustManagerName;//使用者
	private Date LstLastOrderDate;//上次下单时间
	private Date LstLostDate;//确认流失
	private String LstDelay;//暂缓措施
	private String LstReason;//流失原因
	private String LstStatus;//状态（暂时流失、确认流失）

	//.关联属性
	private CstCustomer cstCustomer;
	public CstCustomer getCstCustomer() {return cstCustomer;}
	public void setCstCustomer(CstCustomer cstCustomer) {this.cstCustomer = cstCustomer;}
	
	//.getter/setter
	public long getLstId() {
		return LstId;
	}
	public void setLstId(long lstId) {
		LstId = lstId;
	}
	public long getLstCustManagerId() {
		return LstCustManagerId;
	}
	public void setLstCustManagerId(long lstCustManagerId) {
		LstCustManagerId = lstCustManagerId;
	}
	public String getLstCustManagerName() {
		return LstCustManagerName;
	}
	public void setLstCustManagerName(String lstCustManagerName) {
		LstCustManagerName = lstCustManagerName;
	}
	public Date getLstLastOrderDate() {
		return LstLastOrderDate;
	}
	public void setLstLastOrderDate(Date lstLastOrderDate) {
		LstLastOrderDate = lstLastOrderDate;
	}
	public Date getLstLostDate() {
		return LstLostDate;
	}
	public void setLstLostDate(Date lstLostDate) {
		LstLostDate = lstLostDate;
	}
	public String getLstDelay() {
		return LstDelay;
	}
	public void setLstDelay(String lstDelay) {
		LstDelay = lstDelay;
	}
	public String getLstReason() {
		return LstReason;
	}
	public void setLstReason(String lstReason) {
		LstReason = lstReason;
	}
	public String getLstStatus() {
		return LstStatus;
	}
	public void setLstStatus(String lstStatus) {
		LstStatus = lstStatus;
	}
	
}
