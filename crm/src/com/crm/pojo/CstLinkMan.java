package com.crm.pojo;
/**
 * 
 * @Description TODO
 * @author ��������
 * @date 2017��7��18�� ����1:47:41
 *
 * @version
 */
public class CstLinkMan {
	
	//. ����
	private long lkmId;//����	
	private String lkmName;//��ϵ������
	private String lkmSex;//��ϵ��Щ��
	private String lkmPostion;//��ϵ��ְλ
	private String lkmTel;//�칫�绰
	private String lkmMobile;//��ϵ���ֻ�
	private String lkmMemo;//��ע
	
	//.��������
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
