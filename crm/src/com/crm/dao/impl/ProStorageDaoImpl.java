package com.crm.dao.impl;

import org.hibernate.SessionFactory;

import com.crm.dao.ProStorageDao;

public class ProStorageDaoImpl implements ProStorageDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
