package com.crm.service.impl;

import java.util.List;

import com.crm.dao.CstCustomerDao;
import com.crm.pojo.CstCustomer;
import com.crm.service.CstCustomerService;

public class CstCustomerServiceImpl implements CstCustomerService {
	
	private CstCustomerDao cstCustomerDao;
	public void setCstCustomerDao(CstCustomerDao cstCustomerDao) {
		this.cstCustomerDao = cstCustomerDao;
	}
	
	//---
	//---
	//---
	
	@Override
	public void add(CstCustomer cstCustomer) {
		cstCustomerDao.add(cstCustomer);
	}
	@Override
	public void delete(CstCustomer cstCustomer) {
		cstCustomerDao.delete(cstCustomer);
	}
	@Override
	public void update(CstCustomer cstCustomer) {
		cstCustomerDao.update(cstCustomer);
	}
	@Override
	public CstCustomer findById(String id) {
		CstCustomer cstCustomer = cstCustomerDao.findById(id);
		return cstCustomer;
	}
	@Override
	public List<CstCustomer> findAll() {
		List<CstCustomer> cstCustomerList = cstCustomerDao.findAll();
		return cstCustomerList;
	}
	
}
