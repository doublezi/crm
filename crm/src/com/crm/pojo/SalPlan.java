package com.crm.pojo;

import java.util.Date;

/**
 * �����ƻ�
 * @Description TODO
 * @author ��������
 * @date 2017��7��18�� ����3:41:59
 *
 * @version
 */
public class SalPlan {
	/**
	 * PROPERTIES
	 */
	private long plaId;//����
	private Date plaDate;//�ƻ�ʱ��
	private String plaTodo;//�ƻ�����
	private String plaResult;//ִ��Ч��
	//.
	private SalChance salChance;
	
	
	public SalChance getSalChance() {
		return salChance;
	}
	public void setSalChance(SalChance salChance) {
		this.salChance = salChance;
	}
	public long getPlaId() {
		return plaId;
	}
	public void setPlaId(long plaId) {
		this.plaId = plaId;
	}
	public Date getPlaDate() {
		return plaDate;
	}
	public void setPlaDate(Date plaDate) {
		this.plaDate = plaDate;
	}
	public String getPlaTodo() {
		return plaTodo;
	}
	public void setPlaTodo(String plaTodo) {
		this.plaTodo = plaTodo;
	}
	public String getPlaResult() {
		return plaResult;
	}
	public void setPlaResult(String plaResult) {
		this.plaResult = plaResult;
	}
	@Override
	public String toString() {
		return "SalPlan [plaId=" + plaId + ", plaDate=" + plaDate + ", plaTodo=" + plaTodo + ", plaResult=" + plaResult
				+ ", salChance=" + salChance + "]";
	}
	
	
}
