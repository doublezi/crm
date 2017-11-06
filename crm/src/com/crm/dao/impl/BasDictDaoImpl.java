package com.crm.dao.impl;

import org.hibernate.SessionFactory;

import com.crm.dao.BasDictDao;

public class BasDictDaoImpl implements BasDictDao {
	
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
