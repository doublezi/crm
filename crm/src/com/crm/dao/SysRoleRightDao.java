package com.crm.dao;

import java.util.List;

import com.crm.pojo.SysRoleRight;

public interface SysRoleRightDao {
	
	public void add(SysRoleRight sysRoleRight);
	
	public void delete(SysRoleRight sysRoleRight);
	
	public void update(SysRoleRight sysRoleRight);
	
	public SysRoleRight findById(Long id);
	
	public List<SysRoleRight> findAll();
}
