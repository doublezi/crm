package com.crm.dao;

import java.util.List;

import com.crm.pojo.CstLost;

public interface CstLostDao {
	
	public void add(CstLost cstLost);
	
	public void delete(CstLost cstLost);
	
	public void update(CstLost cstLost);
	
	public CstLost findById(Long id);
	
	public List<CstLost> findAll();
}
