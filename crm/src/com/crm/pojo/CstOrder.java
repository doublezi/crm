package com.crm.pojo;

import java.util.Date;
/**
 * �ͻ�����
 * @Description TODO
 * @author ��������
 * @date 2017��7��18�� ����2:24:16
 *
 * @version 1.0
 */
public class CstOrder {
	/**
	 * PROPERTIES
	 */
	private long odrId;//����
	private Date odrDate;//����ʱ��
	private String odrAddr;//�������ڵ�ַ
	private char odrStatus;//����״̬
	/**
	 * CstOrder(MANY) AND CstCustomer(ONE)
	 */
	
	/**
	 * SETTER / GETTER METHOD 
	 */
	public long getOdrId() {
		return odrId;
	}
	public void setOdrId(long odrId) {
		this.odrId = odrId;
	}
	public Date getOdrDate() {
		return odrDate;
	}
	public void setOdrDate(Date odrDate) {
		this.odrDate = odrDate;
	}
	public String getOdrAddr() {
		return odrAddr;
	}
	public void setOdrAddr(String odrAddr) {
		this.odrAddr = odrAddr;
	}
	public char getOdrStatus() {
		return odrStatus;
	}
	public void setOdrStatus(char odrStatus) {
		this.odrStatus = odrStatus;
	}
	
}
