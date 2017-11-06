package com.crm.dao.impl;

import org.hibernate.SessionFactory;

import com.crm.dao.CstOrderDao;

public class CstOrderDaoImpl implements CstOrderDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
