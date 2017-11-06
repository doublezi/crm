package com.crm.pojo;

import java.util.Set;

/**
 * 客户
 * @Description TODO
 * @author 隔壁老王
 * @date 2017年7月18日 下午1:28:25
 *
 * @version 1.0
 */
public class CstCustomer {
	
	//. 属性
	private String custNo;//主键
	private String custName;//客户姓名（公司名称）
	private String custRegion;//客户地区
	private long custManagerId;//客户经理编号
	private String custManagerName;//客户经理姓名
	private int custLevel;//客户等级（数字）
	private String custLevelLabel;//客户等级（等级描述）
	private int custSatisfy;//客户满意度
	private int custCredit;//客户信用度
	private String custAddr;//客户地址
	private char custZip;//客户邮政编码
	private String custTel;//客户电话
	private String custFax;//客户传真
	private String custWebsite;//客户网址
	private String custLicenceNo;//营业执照注册号
	private String custChieftain;//法人
	private long custBankroll;//注册资金
	private long custTurnover;//年营业额
	private String custBank;//开户银行
	private String custBankAccount;//银行账号
	private String custLocalTaxNo;//地税登记号
	private String custNationalTaxNo;//国税登记号
	private char custStatus;//客户状态
	
	//. 关联属性
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
