package com.crm.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.crm.dao.SalPlanDao;
import com.crm.pojo.SalPlan;

public class SalPlanDaoImpl implements SalPlanDao{
	
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	//---
	//---
	//---
	
	@Override
	public void add(SalPlan salPlan) {
		Session session = sessionFactory.getCurrentSession();
		session.save(salPlan);
	}
	
	@Override
	public void delete(SalPlan salPlan) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(salPlan);
	}
	
	@Override
	public void update(SalPlan salPlan) {
		Session session = sessionFactory.getCurrentSession();
		session.update(salPlan);
	}
	
	@Override
	public SalPlan findById(Long id) {
		Session session = sessionFactory.openSession();
		return session.get(SalPlan.class, id);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<SalPlan> findAll() {
		Session session = sessionFactory.openSession();
		Query<SalPlan> query = session.createQuery("FROM SalPlan");
		return query.list();
	}
}
