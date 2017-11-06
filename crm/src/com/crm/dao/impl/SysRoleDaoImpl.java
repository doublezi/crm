package com.crm.dao.impl;

import java.util.Collection;
import java.util.List;

import org.hibernate.SessionFactory;

import com.crm.dao.SysRoleDao;
import com.crm.pojo.SysRole;

public class SysRoleDaoImpl implements SysRoleDao {

	//�ٷ����飺ʹ��ORM�Դ���APIs,Ŀǰ�����Ƽ�*Template
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	//---
	//---
	//---
	
	@Override
	public void add(SysRole sysRole) {
		this.sessionFactory.getCurrentSession()
						   .save(sysRole);
	}

	@Override
	public void delete(SysRole sysRole) {
		this.sessionFactory.getCurrentSession()
		  	  	 		   .delete(sysRole);
	}

	@Override
	public void update(SysRole sysRole) {
		this.sessionFactory.getCurrentSession()
		       			   .update(sysRole);
	}
	
	@Override
	public SysRole findById(Long id) {
		return this.sessionFactory.openSession()
						   		  .get(SysRole.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SysRole> findAll() {
		List<?> list = this.sessionFactory.openSession() 
						   			.createQuery("FROM syRole")
						   			.list();
		return (List<SysRole>) list;
	}

	

}
