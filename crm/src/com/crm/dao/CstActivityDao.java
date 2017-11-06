package com.crm.dao;

import java.util.List;

import com.crm.pojo.CstActivity;

public interface CstActivityDao {

	public void add(CstActivity cstActivity);

	public void delete(CstActivity cstActivity);

	public void update(CstActivity cstActivity);

	public CstActivity findById(long id);

	public List<CstActivity> findAll();
}