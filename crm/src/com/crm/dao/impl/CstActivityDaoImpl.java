package com.crm.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.crm.dao.CstActivityDao;
import com.crm.pojo.CstActivity;

public class CstActivityDaoImpl implements CstActivityDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	// ---
	// ---
	// ---

	@Override
	public void add(CstActivity cstActivity) {
		getSession().save(cstActivity);
	}

	@Override
	public void delete(CstActivity cstActivity) {
		getSession().delete(cstActivity);
	}

	@Override
	public void update(CstActivity cstActivity) {
		getSession().update(cstActivity);
	}

	@Override
	public CstActivity findById(long id) {
		CstActivity cstActivity = getSession().get(CstActivity.class, id);
		return cstActivity;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CstActivity> findAll() {
		Query<CstActivity> query = getSession().createQuery("FROM CstActivity");
		return query.list();
	}
}
