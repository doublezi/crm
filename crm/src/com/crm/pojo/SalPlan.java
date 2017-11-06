package com.crm.pojo;

import java.util.Date;

/**
 * 开发计划
 * @Description TODO
 * @author 隔壁老王
 * @date 2017年7月18日 下午3:41:59
 *
 * @version
 */
public class SalPlan {
	/**
	 * PROPERTIES
	 */
	private long plaId;//主键
	private Date plaDate;//计划时间
	private String plaTodo;//计划内容
	private String plaResult;//执行效果
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
