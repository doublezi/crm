package com.crm.service.impl;

import java.util.List;

import com.crm.dao.CstLostDao;
import com.crm.pojo.CstLost;
import com.crm.service.CstLostService;

public class CstLostServiceImpl implements CstLostService {
	
	private CstLostDao cstLostDao;
	public void setCstLostDao(CstLostDao cstLostDao) {
		this.cstLostDao = cstLostDao;
	}
	
	//---
	//---
	//---
	
	@Override
	public void add(CstLost cstLost) {
		cstLostDao.add(cstLost);
	}
	@Override
	public void delete(CstLost cstLost) {
		cstLostDao.delete(cstLost);
	}
	@Override
	public void update(CstLost cstLost) {
		cstLostDao.update(cstLost);
	}
	@Override
	public CstLost findById(Long id) {
		return cstLostDao.findById(id);
	}
	@Override
	public List<CstLost> findAll() {
		return cstLostDao.findAll();
	}
	
}
