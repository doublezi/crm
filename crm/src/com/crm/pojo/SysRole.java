package com.crm.pojo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ��ɫ
 * ��ɫ��ָ��ʹ��CRMϵͳ���û���ݣ���ݲ�ͬ��Ȩ��Ҳ��ͬ��
 * v1.0����Ҫ�޶����ĸ��û���ݣ�1.ϵͳ����Ա</br>2.�߹�</br>3.�ͻ�����</br>4.��������</br>
 * �����û�����ڲ���ϵͳʱ����Լ�����������������ĵ�������
 * @Description TODO
 * @author ��������
 * @date 2017��7��18�� ����3:49:16
 *
 * @version
 */
public class SysRole {
	/**
	 * PROPERTIES
	 */
	private long roleId; //����
	private String roleName;//��ɫ����
	private String roleDesc;//��ɫ����
	private int roleFlag;//��ɫ״̬��1��0��1��ʾ���ã�
	/**
	 * Ȩ��ģ��
	 */
	private List<SysRoleRight> sysRoleRight;
	
	public List<SysRoleRight> getSysRoleRight() {
		return sysRoleRight;
	}
	public void setSysRoleRight(List<SysRoleRight> sysRoleRight) {
		this.sysRoleRight = sysRoleRight;
	}
	/**
	 * �û�ģ��
	 */
	private Set<SysUser> sysUsers=new HashSet<SysUser>();
	
	public Set<SysUser> getSysUsers() {
		return sysUsers;
	}
	public void setSysUsers(Set<SysUser> sysUsers) {
		this.sysUsers = sysUsers;
	}
	/**
	 * SETTER / GETTER METHODS 
	 */
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDesc() {
		return roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	public int getRoleFlag() {
		return roleFlag;
	}
	public void setRoleFlag(int roleFlag) {
		this.roleFlag = roleFlag;
	}
	
}
