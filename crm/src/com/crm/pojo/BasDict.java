package com.crm.pojo;
/**
 * �����ֵ�
 * @Description TODO
 * @author ��������
 * @date 2017��7��18�� ����1:08:06
 *
 * @version 1.0
 */
public class BasDict {
	/**
	 * PROPERTIES
	 */
	private long dictId;//����
	private String dictType;//�����ֵ����
	private String dictItem;//�����ֵ���Ŀ
	private String dictValue;//�����ֵ�����
	private boolean dictIsEditable;//�Ƿ�����
	/**
	 * SETTER / GETTER METHODS
	 */
	public long getDictId() {
		return dictId;
	}
	public void setDictId(long dictId) {
		this.dictId = dictId;
	}
	public String getDictType() {
		return dictType;
	}
	public void setDictType(String dictType) {
		this.dictType = dictType;
	}
	public String getDictItem() {
		return dictItem;
	}
	public void setDictItem(String dictItem) {
		this.dictItem = dictItem;
	}
	public String getDictValue() {
		return dictValue;
	}
	public void setDictValue(String dictValue) {
		this.dictValue = dictValue;
	}
	public boolean isDictIsEditable() {
		return dictIsEditable;
	}
	public void setDictIsEditable(boolean dictIsEditable) {
		this.dictIsEditable = dictIsEditable;
	}
	
	
	
}
