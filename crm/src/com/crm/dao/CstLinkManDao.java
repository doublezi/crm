package com.crm.dao;

import java.util.List;

import com.crm.pojo.CstLinkMan;

public interface CstLinkManDao {
	
	public void add(CstLinkMan cstLinkMan);
	
	public void delete(CstLinkMan cstLinkMan);
	
	public void update(CstLinkMan cstLinkMan);
	
	public CstLinkMan findById(Long id);
	
	public List<CstLinkMan> findAll();
}
