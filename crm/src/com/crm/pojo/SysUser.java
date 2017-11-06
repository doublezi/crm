package com.crm.pojo;
/**
 * 用户
 * @Description TODO
 * @author 隔壁老王
 * @date 2017年7月18日 下午3:55:54
 *
 * @version
 */
public class SysUser {
	/**
	 * PROPERTIES
	 */
	private long userId;
	private String userName;
	private String userPassword;
	private int userFlag;
	
	/**
	 * 角色模型
	 */
	private SysRole sysRole;
	
	
	public SysRole getSysRole() {
		return sysRole;
	}
	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}
	/**
	 * SETTER / GETTER METHODS 
	 */
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getUserFlag() {
		return userFlag;
	}
	public void setUserFlag(int userFlag) {
		this.userFlag = userFlag;
	}
	
	
}
