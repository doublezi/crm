package com.crm.service.impl;

import com.crm.dao.BasDictDao;
import com.crm.service.BasDictService;

public class BasDictServiceImpl implements BasDictService {
	private BasDictDao basDictDao;
	public void setBasDictDao(BasDictDao basDictDao) {
		this.basDictDao = basDictDao;
	}
	
}
