package com.crm.pojo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 角色
 * 角色类指代使用CRM系统的用户身份，身份不同，权限也不同。
 * v1.0版主要限定在四个用户身份：1.系统管理员</br>2.高管</br>3.客户经理</br>4.销售主管</br>
 * 各个用户身份在操作系统时，有约束（详见《需求分析文档》）。
 * @Description TODO
 * @author 隔壁老王
 * @date 2017年7月18日 下午3:49:16
 *
 * @version
 */
public class SysRole {
	/**
	 * PROPERTIES
	 */
	private long roleId; //主键
	private String roleName;//角色名称
	private String roleDesc;//角色描述
	private int roleFlag;//角色状态（1或0，1表示可用）
	/**
	 * 权限模型
	 */
	private List<SysRoleRight> sysRoleRight;
	
	public List<SysRoleRight> getSysRoleRight() {
		return sysRoleRight;
	}
	public void setSysRoleRight(List<SysRoleRight> sysRoleRight) {
		this.sysRoleRight = sysRoleRight;
	}
	/**
	 * 用户模型
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
