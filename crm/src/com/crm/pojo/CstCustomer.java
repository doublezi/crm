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
	private int custLevel;//客户等级（数字）
	private char custZip;//客户邮政编码
	private long custManagerId;//客户经理编号
	private String custNo;//主键
	private String custName;//客户姓名（公司名称）
	private String custIDC;//身份证照(文件)

	
	//. 关联属性
	
	private CstActivity cstActivity;
	public CstActivity getCstActivity() {return cstActivity;}
	public void setCstActivity(CstActivity cstActivity) {this.cstActivity = cstActivity;}
	
	
	private Set<CstService> cstServices;
	public Set<CstService> getCstServices() {return cstServices;}
	public void setCstServices(Set<CstService> cstServices) {this.cstServices = cstServices;}
	
	//. getter/setter
	public int getCustLevel() {
		return custLevel;
	}
	public void setCustLevel(int custLevel) {
		this.custLevel = custLevel;
	}
	public char getCustZip() {
		return custZip;
	}
	public void setCustZip(char custZip) {
		this.custZip = custZip;
	}
	public long getCustManagerId() {
		return custManagerId;
	}
	public void setCustManagerId(long custManagerId) {
		this.custManagerId = custManagerId;
	}
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
	public String getCustIDC() {
		return custIDC;
	}
	public void setCustIDC(String custIDC) {
		this.custIDC = custIDC;
	}
	

	
	
	
}
