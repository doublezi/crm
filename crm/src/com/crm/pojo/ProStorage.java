package com.crm.pojo;
/**
 * ���
 * @Description TODO
 * @author ��������
 * @date 2017��7��18�� ����3:13:32
 *
 * @version 1.0
 */
public class ProStorage {
	/**
	 * 
	 */
	private long stkId;//����
	private String stkWareHouse;//�ֿ�
	private String stkWare;//��λ
	private int stkCount;//����
	private String stkMemo;//��ע
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
