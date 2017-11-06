package com.crm.pojo;
/**
 * 库存
 * @Description TODO
 * @author 隔壁老王
 * @date 2017年7月18日 下午3:13:32
 *
 * @version 1.0
 */
public class ProStorage {
	/**
	 * 
	 */
	private long stkId;//主键
	private String stkWareHouse;//仓库
	private String stkWare;//货位
	private int stkCount;//件数
	private String stkMemo;//备注
	/**
	 * ProProduct(MANY) TO ProStorage(ONE) 
	 */
	public long getStkId() {
		return stkId;
	}
	public void setStkId(long stkId) {
		this.stkId = stkId;
	}
	public String getStkWareHouse() {
		return stkWareHouse;
	}
	public void setStkWareHouse(String stkWareHouse) {
		this.stkWareHouse = stkWareHouse;
	}
	public String getStkWare() {
		return stkWare;
	}
	public void setStkWare(String stkWare) {
		this.stkWare = stkWare;
	}
	public int getStkCount() {
		return stkCount;
	}
	public void setStkCount(int stkCount) {
		this.stkCount = stkCount;
	}
	public String getStkMemo() {
		return stkMemo;
	}
	public void setStkMemo(String stkMemo) {
		this.stkMemo = stkMemo;
	}
	
	
}
