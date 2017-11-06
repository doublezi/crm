package com.crm.service.impl;

import com.crm.dao.ProProductDao;
import com.crm.service.ProProductService;

public class ProProductServiceImpl implements ProProductService {
	private ProProductDao proProductDao;
	public void setProProductDao(ProProductDao proProductDao) {
		this.proProductDao = proProductDao;
	}
	
}
