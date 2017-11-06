package com.crm.service;

import java.util.List;

import com.crm.pojo.SysRoleRight;

public interface SysRoleRightService {
	
	public void add(SysRoleRight sysRoleRight);
	
	public void delete(SysRoleRight sysRoleRight);
	
	public void update(SysRoleRight sysRoleRight);
	
	public SysRoleRight findById(Long id);
	
	public List<SysRoleRight> findAll();
}
