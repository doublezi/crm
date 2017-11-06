package com.crm.dao;

import java.util.List;

import com.crm.pojo.CstService;

public interface CstServiceDao {
	
	public void add(CstService cstService);
	
	public void delete(CstService cstService);
	
	public void update(CstService cstService);
	
	public CstService findById(Long id);
	
	public List<CstService> findAll();
}
