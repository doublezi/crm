package com.crm.service;

import java.util.List;

import com.crm.pojo.SalPlan;

public interface SalPlanService {
	
	public void add(SalPlan salPlan);
	
	public void delete(SalPlan salPlan);
	
	public void update(SalPlan salPlan);
	
	public SalPlan findById(Long id);
	
	public List<SalPlan> findAll();
}
