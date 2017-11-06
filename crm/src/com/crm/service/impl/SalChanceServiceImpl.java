package com.crm.service.impl;

import java.util.List;

import com.crm.dao.SalChanceDao;
import com.crm.pojo.SalChance;
import com.crm.service.SalChanceService;

public class SalChanceServiceImpl implements SalChanceService {
	
	private SalChanceDao salChanceDao;
	public void setSalChanceDao(SalChanceDao salChanceDao) {
		this.salChanceDao = salChanceDao;
	}
	
	@Override
	public void add(SalChance salChance) {
		salChanceDao.add(salChance);
	}
	@Override
	public void delete(SalChance salChance) {
		salChanceDao.delete(salChance);
	}
	@Override
	public void update(SalChance salChance) {
		salChanceDao.update(salChance);
	}
	@Override
	public SalChance findById(Long id) {
		SalChance salChance = salChanceDao.findById(id);
		return salChance;
	}
	@Override
	public List<SalChance> findAll() {
		List<SalChance> salChanceList = salChanceDao.findAll();
		return salChanceList;
	}
	
}
