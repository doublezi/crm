package com.crm.pojo;

import java.util.Date;

/**
 * �ͻ���ʧ
 * @Description TODO
 * @author ��������
 * @date 2017��7��18�� ����2:08:54
 *
 * @version 1.0
 */
public class CstLost {
	
	//.��������
	private long LstId;//����
	private long LstCustManagerId;//ʹ���߱��
	private String LstCustManagerName;//ʹ����
	private Date LstLastOrderDate;//�ϴ��µ�ʱ��
	private Date LstLostDate;//ȷ����ʧ
	private String LstDelay;//�ݻ���ʩ
	private String LstReason;//��ʧԭ��
	private String LstStatus;//״̬����ʱ��ʧ��ȷ����ʧ��

	//.��������
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
