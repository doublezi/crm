package com.crm.pojo;

import java.util.Date;
/**
 * 客户订单
 * @Description TODO
 * @author 隔壁老王
 * @date 2017年7月18日 下午2:24:16
 *
 * @version 1.0
 */
public class CstOrder {
	/**
	 * PROPERTIES
	 */
	private long odrId;//主键
	private Date odrDate;//订单时间
	private String odrAddr;//订单所在地址
	private char odrStatus;//订单状态
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
