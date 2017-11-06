package com.crm.service.impl;

import java.util.List;

import com.crm.dao.SalPlanDao;
import com.crm.pojo.SalPlan;
import com.crm.service.SalPlanService;

public class SalPlanServiceImpl implements SalPlanService {
	
	private SalPlanDao salPlanDao;
	public void setSalPlanDao(SalPlanDao salPlanDao) {
		this.salPlanDao = salPlanDao;
	}
	
	@Override
	public void add(SalPlan salPlan) {
		salPlanDao.add(salPlan);
	}
	@Override
	public void delete(SalPlan salPlan) {
		salPlanDao.delete(salPlan);
	}
	@Override
	public void update(SalPlan salPlan) {
		salPlanDao.update(salPlan);
	}
	@Override
	public SalPlan findById(Long id) {
		SalPlan salPlan = salPlanDao.findById(id);
		return salPlan;
	}
	@Override
	public List<SalPlan> findAll() {
		List<SalPlan> salPlanList = salPlanDao.findAll();
		return salPlanList;
	}
	
}
