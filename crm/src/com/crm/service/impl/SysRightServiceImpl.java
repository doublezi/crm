package com.crm.service.impl;

import java.util.List;

import com.crm.dao.SysRightDao;
import com.crm.pojo.SysRight;
import com.crm.service.SysRightService;

public class SysRightServiceImpl implements SysRightService {

	private SysRightDao sysRightDao;
	public void setSysRightDao(SysRightDao sysRightDao) {
		this.sysRightDao = sysRightDao;
	}

	@Override
	public void add(SysRight sysRight) {
		sysRightDao.add(sysRight);
	}

	@Override
	public void delete(SysRight sysRight) {
		sysRightDao.delete(sysRight);
	}

	@Override
	public void update(SysRight sysRight) {
		sysRightDao.update(sysRight);
	}

	@Override
	public SysRight findById(String id) {
		SysRight sysRight = sysRightDao.findById(id);
		return sysRight;
	}

	@Override
	public List<SysRight> findAll() {
		List<SysRight> sysRights = sysRightDao.findAll();
		return sysRights;
	}

}
