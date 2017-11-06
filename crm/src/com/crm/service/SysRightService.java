package com.crm.service;

import java.util.List;

import com.crm.pojo.SysRight;

public interface SysRightService {

	public void add(SysRight sysRight);
	
	public void delete(SysRight sysRight);
	
	public void update(SysRight sysRight);
	
	public SysRight findById(String id);
	
	public List<SysRight> findAll();
}
