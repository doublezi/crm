package com.crm.service;

import java.util.List;

import com.crm.pojo.CstLost;

public interface CstLostService {
	
	public void add(CstLost cstLost);

	public void delete(CstLost cstLost);

	public void update(CstLost cstLost);

	public CstLost findById(Long id);

	public List<CstLost> findAll();
	
}
