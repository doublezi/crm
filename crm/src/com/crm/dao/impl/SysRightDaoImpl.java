package com.crm.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.crm.dao.SysRightDao;
import com.crm.pojo.SysRight;


public class SysRightDaoImpl implements SysRightDao {

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	//---
	//---
	//---
	
	@Override
	public void add(SysRight sysRight) {
		Session session = sessionFactory.getCurrentSession();
		session.save(sysRight);
	}
	@Override
	public void delete(SysRight sysRight) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(sysRight);
	}
	@Override
	public void update(SysRight sysRight) {
		Session session = sessionFactory.getCurrentSession();
		session.update(sysRight);
	}
	@Override
	public SysRight findById(String id) {
		Session session = sessionFactory.getCurrentSession();
		SysRight sysRight = session.get(SysRight.class, id);
		return sysRight;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<SysRight> findAll() {
		Session session = sessionFactory.openSession();
		Query<SysRight> query = session.createQuery("FROM SysRight");
		List<SysRight> sysRights = query.list();
		return sysRights;
	}


	
	
}
