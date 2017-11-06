package com.crm.pojo;

import java.util.Set;

/**
 * �ͻ�
 * @Description TODO
 * @author ��������
 * @date 2017��7��18�� ����1:28:25
 *
 * @version 1.0
 */
public class CstCustomer {
	
	//. ����
	private String custNo;//����
	private String custName;//�ͻ���������˾���ƣ�
	private String custRegion;//�ͻ�����
	private long custManagerId;//�ͻ�������
	private String custManagerName;//�ͻ���������
	private int custLevel;//�ͻ��ȼ������֣�
	private String custLevelLabel;//�ͻ��ȼ����ȼ�������
	private int custSatisfy;//�ͻ������
	private int custCredit;//�ͻ����ö�
	private String custAddr;//�ͻ���ַ
	private char custZip;//�ͻ���������
	private String custTel;//�ͻ��绰
	private String custFax;//�ͻ�����
	private String custWebsite;//�ͻ���ַ
	private String custLicenceNo;//Ӫҵִ��ע���
	private String custChieftain;//����
	private long custBankroll;//ע���ʽ�
	private long custTurnover;//��Ӫҵ��
	private String custBank;//��������
	private String custBankAccount;//�����˺�
	private String custLocalTaxNo;//��˰�ǼǺ�
	private String custNationalTaxNo;//��˰�ǼǺ�
	private char custStatus;//�ͻ�״̬
	
	//. ��������
	private Set<CstLinkMan> cstLinkMans;
	public Set<CstLinkMan> getCstLinkMans() {return cstLinkMans;}
	public void setCstLinkMans(Set<CstLinkMan> cstLinkMans) {this.cstLinkMans = cstLinkMans;}
	
	private CstActivity cstActivity;
	public CstActivity getCstActivity() {return cstActivity;}
	public void setCstActivity(CstActivity cstActivity) {this.cstActivity = cstActivity;}
	
	private CstLost cstLost;
	public CstLost getCstLost() {return cstLost;}
	public void setCstLost(CstLost cstLost) {this.cstLost = cstLost;}
	
	private Set<CstService> cstServices;
	public Set<CstService> getCstServices() {return cstServices;}
	public void setCstServices(Set<CstService> cstServices) {this.cstServices = cstServices;}
	
	//. getter/setter
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustRegion() {
		return custRegion;
	}
	public void setCustRegion(String custRegion) {
		this.custRegion = custRegion;
	}
	public long getCustManagerId() {
		return custManagerId;
	}
	public void setCustManagerId(long custManagerId) {
		this.custManagerId = custManagerId;
	}
	public String getCustManagerName() {
		return custManagerName;
	}
	public void setCustManagerName(String custManagerName) {
		this.custManagerName = custManagerName;
	}
	public int getCustLevel() {
		return custLevel;
	}
	public void setCustLevel(int custLevel) {
		this.custLevel = custLevel;
	}
	public String getCustLevelLabel() {
		return custLevelLabel;
	}
	public void setCustLevelLabel(String custLevelLabel) {
		this.custLevelLabel = custLevelLabel;
	}
	public int getCustSatisfy() {
		return custSatisfy;
	}
	public void setCustSatisfy(int custSatisfy) {
		this.custSatisfy = custSatisfy;
	}
	public int getCustCredit() {
		return custCredit;
	}
	public void setCustCredit(int custCredit) {
		this.custCredit = custCredit;
	}
	public String getCustAddr() {
		return custAddr;
	}
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	public char getCustZip() {
		return custZip;
	}
	public void setCustZip(char custZip) {
		this.custZip = custZip;
	}
	public String getCustTel() {
		return custTel;
	}
	public void setCustTel(String custTel) {
		this.custTel = custTel;
	}
	public String getCustFax() {
		return custFax;
	}
	public void setCustFax(String custFax) {
		this.custFax = custFax;
	}
	public String getCustWebsite() {
		return custWebsite;
	}
	public void setCustWebsite(String custWebsite) {
		this.custWebsite = custWebsite;
	}
	public String getCustLicenceNo() {
		return custLicenceNo;
	}
	public void setCustLicenceNo(String custLicenceNo) {
		this.custLicenceNo = custLicenceNo;
	}
	public String getCustChieftain() {
		return custChieftain;
	}
	public void setCustChieftain(String custChieftain) {
		this.custChieftain = custChieftain;
	}
	public long getCustBankroll() {
		return custBankroll;
	}
	public void setCustBankroll(long custBankroll) {
		this.custBankroll = custBankroll;
	}
	public long getCustTurnover() {
		return custTurnover;
	}
	public void setCustTurnover(long custTurnover) {
		this.custTurnover = custTurnover;
	}
	public String getCustBank() {
		return custBank;
	}
	public void setCustBank(String custBank) {
		this.custBank = custBank;
	}
	public String getCustBankAccount() {
		return custBankAccount;
	}
	public void setCustBankAccount(String custBankAccount) {
		this.custBankAccount = custBankAccount;
	}
	public String getCustLocalTaxNo() {
		return custLocalTaxNo;
	}
	public void setCustLocalTaxNo(String custLocalTaxNo) {
		this.custLocalTaxNo = custLocalTaxNo;
	}
	public String getCustNationalTaxNo() {
		return custNationalTaxNo;
	}
	public void setCustNationalTaxNo(String custNationalTaxNo) {
		this.custNationalTaxNo = custNationalTaxNo;
	}
	public char getCustStatus() {
		return custStatus;
	}
	public void setCustStatus(char custStatus) {
		this.custStatus = custStatus;
	}
	
	
	
}
