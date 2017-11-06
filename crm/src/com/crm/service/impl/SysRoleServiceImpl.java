package com.crm.service.impl;

import java.util.List;

import com.crm.dao.SysRoleDao;
import com.crm.pojo.SysRole;
import com.crm.service.SysRoleService;

public class SysRoleServiceImpl implements SysRoleService {
	
	private SysRoleDao sysRoleDao;
	public void setSysRoleDao(SysRoleDao sysRoleDao) {
		this.sysRoleDao = sysRoleDao;
	}
	
	//---
	//---
	//---

	@Override
	public void add(SysRole sysRole) {
		sysRoleDao.add(sysRole);
	}

	@Override
	public void delete(SysRole sysRole) {
		sysRoleDao.delete(sysRole);
	}

	@Override
	public void update(SysRole sysRole) {
		sysRoleDao.update(sysRole);
	}

	@Override
	public SysRole getById(Long id) {
		SysRole sysRole = sysRoleDao.findById(id);
		return sysRole;
	}

	@Override
	public List<SysRole> findAll() {
		List<SysRole> sysRoles = sysRoleDao.findAll();
		return sysRoles;
	}
	
	
}
