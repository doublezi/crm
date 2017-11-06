package com.crm.service.impl;

import java.util.List;

import com.crm.dao.CstServiceDao;
import com.crm.pojo.CstService;
import com.crm.service.CstServiceService;

public class CstServiceServiceImpl implements CstServiceService {
	private CstServiceDao cstServiceDao;

	public void setCstServiceDao(CstServiceDao cstServiceDao) {
		this.cstServiceDao = cstServiceDao;
	}

	@Override
	public void add(CstService cstService) {
		cstServiceDao.add(cstService);
	}

	@Override
	public void delete(CstService cstService) {
		cstServiceDao.delete(cstService);
	}

	@Override
	public void update(CstService cstService) {
		cstServiceDao.update(cstService);
	}

	@Override
	public CstService findById(Long id) {
		CstService cstService = cstServiceDao.findById(id);
		return cstService;
	}

	@Override
	public List<CstService> findAll() {
		List<CstService> cstServiceList = cstServiceDao.findAll();
		return cstServiceList;
	}

}
