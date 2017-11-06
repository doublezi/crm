package com.crm.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.crm.dao.CstLostDao;
import com.crm.pojo.CstLost;

public class CstLostDaoImpl implements CstLostDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void add(CstLost cstLost) {
		getSession().save(cstLost);
	}

	@Override
	public void delete(CstLost cstLost) {
		getSession().delete(cstLost);
	}

	@Override
	public void update(CstLost cstLost) {
		getSession().update(cstLost);
	}

	@Override
	public CstLost findById(Long id) {
		return getSession().get(CstLost.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CstLost> findAll() {
		Query<CstLost> query = getSession().createQuery("FROM CstLost");
		return query.list();
	}
}
