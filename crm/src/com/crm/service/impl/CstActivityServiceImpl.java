package com.crm.service.impl;

import java.util.List;

import com.crm.dao.CstActivityDao;
import com.crm.pojo.CstActivity;
import com.crm.service.CstActivityService;

public class CstActivityServiceImpl implements CstActivityService {

	private CstActivityDao cstActivityDao;

	public void setCstActivityDao(CstActivityDao cstActivityDao) {
		this.cstActivityDao = cstActivityDao;
	}

	// ---
	// ---
	// ---

	@Override
	public void add(CstActivity cstActivity) {
		cstActivityDao.add(cstActivity);
	}

	@Override
	public void delete(CstActivity cstActivity) {
		cstActivityDao.delete(cstActivity);
	}

	@Override
	public void update(CstActivity cstActivity) {
		cstActivityDao.update(cstActivity);
	}

	@Override
	public CstActivity findById(long id) {
		return cstActivityDao.findById(id);
	}

	@Override
	public List<CstActivity> findAll() {
		return cstActivityDao.findAll();
	}

}
