package com.crm.dao;

import java.util.List;

import com.crm.pojo.SalPlan;

public interface SalPlanDao {
	
	public void add(SalPlan salPlan);
	
	public void delete(SalPlan salPlan);
	
	public void update(SalPlan salPlan);
	
	public SalPlan findById(Long id);
	
	public List<SalPlan> findAll();
}
