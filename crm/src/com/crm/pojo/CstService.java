package com.crm.pojo;

import java.util.Date;
/**
 * �ͻ�����
 * @Description TODO
 * @author ��������
 * @date 2017��7��18�� ����2:38:09
 *
 * @version
 */
public class CstService {
	
	//.��������
	private long svrId;//����
	private String svrType;//��������
	private String svrTitle;//�����Ҫ
	private String svrStatus;//����״̬���´���/�ѷ���/�Ѵ���/�ѹ鵵��
	private String svrRequest;//��������
	private long svrCreateId;//���񴴽��˱�ţ��ͻ�����
	private String svrCreateName;//���񴴽�������
	private Date svrCreateDate;//���񴴽�ʱ��
	private long svrDueId;//�����������˱��
	private String svrDueName;//����������������
	private Date svrDueDate;//�������ʱ��
	private String svrDeal;//������
	private long svrDealId;//�������˱��
	private String svrDealName;//������������
	private Date svrDealDate;//������ʱ��
	private String svrResult;//��������
	private int svrSatisfy;//���������

	//.��������
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
