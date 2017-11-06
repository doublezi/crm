package com.crm.service.impl;

import java.util.List;

import com.crm.dao.CstLinkManDao;
import com.crm.pojo.CstLinkMan;
import com.crm.service.CstLinkManService;

public class CstLinkManServiceImpl implements CstLinkManService {
	
	private CstLinkManDao cstLinkManDao;
	public void setCstLinkManDao(CstLinkManDao cstLinkManDao) {
		this.cstLinkManDao = cstLinkManDao;
	}
	
	//---
	//---
	//---
	
	@Override
	public void add(CstLinkMan cstLinkMan) {
		cstLinkManDao.add(cstLinkMan);
	}
	@Override
	public void delete(CstLinkMan cstLinkMan) {
		cstLinkManDao.delete(cstLinkMan);
	}
	@Override
	public void update(CstLinkMan cstLinkMan) {
		cstLinkManDao.update(cstLinkMan);
	}
	@Override
	public CstLinkMan findById(Long id) {
		CstLinkMan cstLinkMan = cstLinkManDao.findById(id);
		return cstLinkMan;
	}
	@Override
	public List<CstLinkMan> findAll() {
		List<CstLinkMan> cstLinkMans = cstLinkManDao.findAll();
		return cstLinkMans;
	}
	
	
}
