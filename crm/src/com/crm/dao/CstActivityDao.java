package com.crm.dao;

import java.util.List;

import com.crm.pojo.CstActivity;
/**
 * 
 * ***************************
 * 作者：隔壁老王(ಥ _ ಥ)        
 * ***************************
 * 日期：2017年11月20日              
 * ***************************
 * 时间：上午10:54:08              
 * ***************************
 * 
 */
public interface CstActivityDao {
	
	public void add(CstActivity cstActivity);
	
	public void delete(CstActivity cstActivity);

	public void update(CstActivity cstActivity);

	public CstActivity findById(long id);

	public List<CstActivity> findAll();
	
}
