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
	private int custLevel;//�ͻ��ȼ������֣�
	private char custZip;//�ͻ���������
	private long custManagerId;//�ͻ�������
	private String custNo;//����
	private String custName;//�ͻ���������˾���ƣ�
	private String custIDC;//���֤��(�ļ�)

	
	//. ��������
	
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
