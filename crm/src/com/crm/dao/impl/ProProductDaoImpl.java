package com.crm.dao.impl;

import org.hibernate.SessionFactory;

import com.crm.dao.ProProductDao;

public class ProProductDaoImpl implements ProProductDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
