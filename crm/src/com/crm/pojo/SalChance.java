package com.crm.pojo;

import java.util.Date;

/**
 * ���ۻ���
 * @Description 
 * �ṩ�����ۻ�����ص���������</br>�ṩ{@code getter/setter}������
 * @author ��������
 * @date 2017��7��18�� ����3:36:07
 *
 * @version
 */
public class SalChance {
	
	private long chcId;//����(not null)
	private String chcSource;//������Դ
	private String chcCustName;//�ͻ�����(not null)
	private String chcTitle;//��Ҫ(not null)
	private int chcRate;//�ɹ�����
	private String chcLinkMan;//��ϵ��
	private String chcTel;//��ϵ�˵绰
	private String chcDesc;//��������(not null)
	private long chcCreateId;//�����˱��(not null)
	private String chcCreateName;//����������(not null)
	private Date chcCreateDate;//����ʱ��(not null)
	private long chcDueId;//ָ�ɸ����˱��
	private String chcDueName;//ָ�ɸ���������
	private Date chcDueDate;//ָ��ʱ��
	//.������char���͵�chcStatus�޸�Ϊstring����
	private String chcStatus;//���ۻ���״̬(not null)
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
