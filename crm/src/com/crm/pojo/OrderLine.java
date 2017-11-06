package com.crm.pojo;
/**
 * 订单连接
 * @Description TODO
 * @author 隔壁老王
 * @date 2017年7月18日 下午2:40:40
 *
 * @version
 */
public class OrderLine {
	/**
	 * PROPERTIES
	 */
	private long oddId;//主键
	private int oddCount;//数量
	private String oddUnit;//单位
	private String oddPrice;//价格
	/**
	 *
	 */
	/**
	 * 
	 */
	
	/**
	 * SETTER / GETTER METHODS
	 */
	public long getOddId() {
		return oddId;
	}
	public void setOddId(long oddId) {
		this.oddId = oddId;
	}
	public int getOddCount() {
		return oddCount;
	}
	public void setOddCount(int oddCount) {
		this.oddCount = oddCount;
	}
	public String getOddUnit() {
		return oddUnit;
	}
	public void setOddUnit(String oddUnit) {
		this.oddUnit = oddUnit;
	}
	public String getOddPrice() {
		return oddPrice;
	}
	public void setOddPrice(String oddPrice) {
		this.oddPrice = oddPrice;
	}
	
}
