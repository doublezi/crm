package com.crm.pojo;
/**
 * 权限
 * @Description TODO
 * @author 隔壁老王
 * @date 2017年7月18日 下午3:51:58
 *
 * @version 1.0
 */
public class SysRoleRight {
	/**
	 * PROPERTIES
	 */
	private long rfId;//主键
	
	
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
