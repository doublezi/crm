package com.crm.pojo;
/**
 * �û�
 * @Description TODO
 * @author ��������
 * @date 2017��7��18�� ����3:55:54
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
	 * ��ɫģ��
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
