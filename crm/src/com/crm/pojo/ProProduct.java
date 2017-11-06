package com.crm.pojo;

public class ProProduct {
	private long prodId;//主键
	private String prodName;//产品名称
	private String prodType;//产品型号
	private String prodBatch;//等级、批次
	private String prodUnit;//产品单位
	private String prodPrice;//产品价格
	private String prodMemo;//产品备注
	public long getProdId() {
		return prodId;
	}
	public void setProdId(long prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdType() {
		return prodType;
	}
	public void setProdType(String prodType) {
		this.prodType = prodType;
	}
	public String getProdBatch() {
		return prodBatch;
	}
	public void setProdBatch(String prodBatch) {
		this.prodBatch = prodBatch;
	}
	public String getProdUnit() {
		return prodUnit;
	}
	public void setProdUnit(String prodUnit) {
		this.prodUnit = prodUnit;
	}
	public String getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(String prodPrice) {
		this.prodPrice = prodPrice;
	}
	public String getProdMemo() {
		return prodMemo;
	}
	public void setProdMemo(String prodMemo) {
		this.prodMemo = prodMemo;
	}
	
	
	
}
