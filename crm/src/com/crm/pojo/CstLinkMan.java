package com.crm.pojo;
/**
 * 
 * @Description TODO
 * @author 隔壁老王
 * @date 2017年7月18日 下午1:47:41
 *
 * @version
 */
public class CstLinkMan {
	
	//. 属性
	private long lkmId;//主键	
	private String lkmName;//联系人姓名
	private String lkmSex;//联系人些别
	private String lkmPostion;//联系人职位
	private String lkmTel;//办公电话
	private String lkmMobile;//联系人手机
	private String lkmMemo;//备注
	
	//.关联属性
	private CstCustomer cstCustomer;
	public CstCustomer getCstCustomer() {return cstCustomer;}
	public void setCstCustomer(CstCustomer cstCustomer) {this.cstCustomer = cstCustomer;}

	//. getter/setter
	public long getLkmId() {
		return lkmId;
	}
	
	public void setLkmId(long lkmId) {
		this.lkmId = lkmId;
	}
	public String getLkmName() {
		return lkmName;
	}
	public void setLkmName(String lkmName) {
		this.lkmName = lkmName;
	}
	public String getLkmSex() {
		return lkmSex;
	}
	public void setLkmSex(String lkmSex) {
		this.lkmSex = lkmSex;
	}
	public String getLkmPostion() {
		return lkmPostion;
	}
	public void setLkmPostion(String lkmPostion) {
		this.lkmPostion = lkmPostion;
	}
	public String getLkmTel() {
		return lkmTel;
	}
	public void setLkmTel(String lkmTel) {
		this.lkmTel = lkmTel;
	}
	public String getLkmMobile() {
		return lkmMobile;
	}
	public void setLkmMobile(String lkmMobile) {
		this.lkmMobile = lkmMobile;
	}
	public String getLkmMemo() {
		return lkmMemo;
	}
	public void setLkmMemo(String lkmMemo) {
		this.lkmMemo = lkmMemo;
	}
	
}
