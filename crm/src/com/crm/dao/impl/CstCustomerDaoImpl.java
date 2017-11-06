package com.crm.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.crm.dao.CstCustomerDao;
import com.crm.pojo.CstCustomer;

public class CstCustomerDaoImpl implements CstCustomerDao {
	
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	//---
	//---
	//---
	
	@Override
	public void add(CstCustomer cstCustomer) {
		Session session = sessionFactory.getCurrentSession();
		session.save(cstCustomer);
	}
	@Override
	public void delete(CstCustomer cstCustomer) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(cstCustomer);
	}
	
	@Override
	public void update(CstCustomer cstCustomer) {
		Session session = sessionFactory.getCurrentSession();
		session.update(cstCustomer);
	}
	@Override
	public CstCustomer findById(String id) {
		Session session = sessionFactory.getCurrentSession();
		CstCustomer cstCustomer = session.get(CstCustomer.class, id);
		return cstCustomer;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CstCustomer> findAll() {
		Session session = sessionFactory.openSession();
		Query<CstCustomer> query = session.createQuery("FROM CstCustomer");
		return query.list();
	}
	
	
}
