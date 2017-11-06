package com.crm.dao;

import java.util.List;

import com.crm.pojo.SalChance;

public interface SalChanceDao {
	
	public void add(SalChance salChance);
	
	public void delete(SalChance salChance);
	
	public void update(SalChance salChance);
	
	public SalChance findById(Long id);
	
	public List<SalChance> findAll();
}
