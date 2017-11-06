package com.crm.pojo;
/**
 * 数据字典
 * @Description TODO
 * @author 隔壁老王
 * @date 2017年7月18日 下午1:08:06
 *
 * @version 1.0
 */
public class BasDict {
	/**
	 * PROPERTIES
	 */
	private long dictId;//主键
	private String dictType;//数据字典类别
	private String dictItem;//数据字典条目
	private String dictValue;//数据字典数据
	private boolean dictIsEditable;//是否可添加
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
