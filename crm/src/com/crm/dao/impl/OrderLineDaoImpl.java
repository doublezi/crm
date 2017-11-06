package com.crm.dao.impl;

import org.hibernate.SessionFactory;

import com.crm.dao.OrderLineDao;

public class OrderLineDaoImpl implements OrderLineDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
