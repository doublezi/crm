package com.crm.pojo;

import java.util.Date;

/**
 * 客户与公司交往实体
 * @Description TODO
 * @author 隔壁老王
 * @date 2017年7月18日 下午1:15:46
 *
 * @version 1.0
 */
public class CstActivity {

	//.基础属性
	private long atvId;//主键
	private Date atvDate;//来往日期 【备注：需要开发一个日期转换器】
	private String atvPlace;//来往地址
	private String atvTitle;//概要
	private String atvDesc;//描述

	//.关联属性
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
