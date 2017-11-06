package com.crm.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.crm.dao.CstLinkManDao;
import com.crm.pojo.CstLinkMan;

public class CstLinkManDaoImpl implements CstLinkManDao {
	
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void add(CstLinkMan cstLinkMan) {
		getSession().save(cstLinkMan);
	}
	@Override
	public void delete(CstLinkMan cstLinkMan) {
		getSession().delete(cstLinkMan);
	}
	@Override
	public void update(CstLinkMan cstLinkMan) {
		getSession().update(cstLinkMan);
	}
	@Override
	public CstLinkMan findById(Long id) {
		CstLinkMan cstLinkMan = getSession().get(CstLinkMan.class, id);
		return cstLinkMan;
	}
	@Override
	public List<CstLinkMan> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
