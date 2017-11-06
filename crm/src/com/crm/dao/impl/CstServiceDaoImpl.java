package com.crm.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.crm.dao.CstServiceDao;
import com.crm.pojo.CstService;

public class CstServiceDaoImpl implements CstServiceDao {

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
	public void add(CstService cstService) {
		getSession().save(cstService);
	}

	@Override
	public void delete(CstService cstService) {
		getSession().delete(cstService);
	}

	@Override
	public void update(CstService cstService) {
		getSession().update(cstService);
		getSession().flush();
	}

	@Override
	public CstService findById(Long id) {
		CstService cstService = getSession().get(CstService.class, id);
		return cstService;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CstService> findAll() {
		Query<CstService> query = getSession().createQuery("FROM CstService");
		return query.list();
	}
}
