package com.crm.service.impl;

import com.crm.dao.ProStorageDao;
import com.crm.service.ProStorageService;

public class ProStorageServiceImpl implements ProStorageService {
	private ProStorageDao proStorageDao;
	public void setProStorageDao(ProStorageDao proStorageDao) {
		this.proStorageDao = proStorageDao;
	}
	
}
