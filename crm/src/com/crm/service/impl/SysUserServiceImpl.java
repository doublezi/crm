package com.crm.service.impl;

import java.util.List;

import com.crm.dao.SysUserDao;
import com.crm.pojo.SysUser;
import com.crm.service.SysUserService;

public class SysUserServiceImpl implements SysUserService {
	
	private SysUserDao sysUserDao;
	public void setSysUserDao(SysUserDao sysUserDao) {
		this.sysUserDao = sysUserDao;
	}

	@Override
	public void add(SysUser sysUser) {
		sysUserDao.add(sysUser);
	}

	@Override
	public void delete(SysUser sysUser) {
		sysUserDao.delete(sysUser);
	}

	@Override
	public void update(SysUser sysUser) {
		sysUserDao.update(sysUser);
	}

	@Override
	public SysUser findById(long id) {
		SysUser sysUser = sysUserDao.findById(id);
		return sysUser;
	}

	@Override
	public List<SysUser> findAll() {
		List<SysUser> sysUsers = sysUserDao.findAll();
		return sysUsers;
	}
	
	
}
