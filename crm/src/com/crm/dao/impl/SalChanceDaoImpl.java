package com.crm.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.crm.dao.SalChanceDao;
import com.crm.pojo.SalChance;

public class SalChanceDaoImpl implements SalChanceDao {
	
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void add(SalChance salChance) {
		Session session = sessionFactory.getCurrentSession();
		session.save(salChance);
	}
	@Override
	public void delete(SalChance salChance) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(salChance);
	}
	@Override
	public void update(SalChance salChance) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(salChance);
	}
	@Override
	public SalChance findById(Long id) {
		Session session = sessionFactory.openSession();
		SalChance salChance = session.get(SalChance.class, id);
		return salChance;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<SalChance> findAll() {
		Session session = sessionFactory.openSession();
		Query<SalChance> query = session.createQuery("FROM SalChance");
		return query.list();
	}
}
