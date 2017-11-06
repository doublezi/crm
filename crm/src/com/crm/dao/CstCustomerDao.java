package com.crm.dao;

import java.util.List;

import com.crm.pojo.CstCustomer;

public interface CstCustomerDao {
	
	public void add(CstCustomer cstCustomer);
	
	public void delete(CstCustomer cstCustomer);
	
	public void update(CstCustomer cstCustomer);
	
	public CstCustomer findById(String id);
	
	public List<CstCustomer> findAll();
	
}
