package com.crm.pojo;
/**
 * Ȩ��
 * @Description TODO
 * @author ��������
 * @date 2017��7��18�� ����3:51:58
 *
 * @version 1.0
 */
public class SysRoleRight {
	/**
	 * PROPERTIES
	 */
	private long rfId;//����
	
	
	/**
	 * SysRoleRight(ONE) TO SysRole(ONE)
	 */
	private SysRole sysRole;
	
	/**
	 * SysRight(ONE) TO SysRight(ONE)
	 */
	private SysRight sysRight;
	
	public SysRight getSysRight() {
		return sysRight;
	}

	public void setSysRight(SysRight sysRight) {
		this.sysRight = sysRight;
	}

	public SysRole getSysRole() {
		return sysRole;
	}

	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}

	/**
	 * SETTER / GETTER METHODS
	 */
	public long getRfId() {
		return rfId;
	}

	public void setRfId(long rfId) {
		this.rfId = rfId;
	}
	
	
}
