package com.crm.service.impl;

import com.crm.dao.CstOrderDao;
import com.crm.service.CstOrderService;

public class CstOrderServiceImpl implements CstOrderService {
	private CstOrderDao cstOrderDao;
	public void setCstOrderDao(CstOrderDao cstOrderDao) {
		this.cstOrderDao = cstOrderDao;
	}
	
}
