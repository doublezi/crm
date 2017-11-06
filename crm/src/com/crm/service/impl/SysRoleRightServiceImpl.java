package com.crm.service.impl;

import java.util.List;

import com.crm.dao.SysRoleRightDao;
import com.crm.pojo.SysRoleRight;
import com.crm.service.SysRoleRightService;

public class SysRoleRightServiceImpl implements SysRoleRightService {
	
	private SysRoleRightDao sysRoleRightDao;
	public void setSysRoleRightDao(SysRoleRightDao sysRoleRightDao) {
		this.sysRoleRightDao = sysRoleRightDao;
	}

	//---
	//---
	//---
	
	@Override
	public void add(SysRoleRight sysRoleRight) {
		sysRoleRightDao.add(sysRoleRight);
	}

	@Override
	public void delete(SysRoleRight sysRoleRight) {
		sysRoleRightDao.delete(sysRoleRight);
	}

	@Override
	public void update(SysRoleRight sysRoleRight) {
		sysRoleRightDao.update(sysRoleRight);
	}

	@Override
	public SysRoleRight findById(Long id) {
		return sysRoleRightDao.findById(id);
	}

	@Override
	public List<SysRoleRight> findAll() {
		return sysRoleRightDao.findAll();
	}

}
