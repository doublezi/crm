package com.crm.pojo;

import java.util.Date;

/**
 * �ͻ��빫˾����ʵ��
 * @Description TODO
 * @author ��������
 * @date 2017��7��18�� ����1:15:46
 *
 * @version 1.0
 */
public class CstActivity {

	//.��������
	private long atvId;//����
	private Date atvDate;//�������� ����ע����Ҫ����һ������ת������
	private String atvPlace;//������ַ
	private String atvTitle;//��Ҫ
	private String atvDesc;//����

	//.��������
	private CstCustomer cstCustomer;
	public CstCustomer getCstCustomer() {return cstCustomer;}
	public void setCstCustomer(CstCustomer cstCustomer) {this.cstCustomer = cstCustomer;}

	public long getAtvId() {
		return atvId;
	}

	public void setAtvId(long atvId) {
		this.atvId = atvId;
	}

	public Date getAtvDate() {
		return atvDate;
	}

	public void setAtvDate(Date atvDate) {
		this.atvDate = atvDate;
	}

	public String getAtvPlace() {
		return atvPlace;
	}

	public void setAtvPlace(String atvPlace) {
		this.atvPlace = atvPlace;
	}

	public String getAtvTitle() {
		return atvTitle;
	}

	public void setAtvTitle(String atvTitle) {
		this.atvTitle = atvTitle;
	}

	public String getAtvDesc() {
		return atvDesc;
	}

	public void setAtvDesc(String atvDesc) {
		this.atvDesc = atvDesc;
	}
	
	
	
	
	
}
