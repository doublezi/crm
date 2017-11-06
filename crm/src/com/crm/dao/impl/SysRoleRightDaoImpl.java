package com.crm.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.crm.dao.SysRoleRightDao;
import com.crm.pojo.SysRoleRight;

public class SysRoleRightDaoImpl implements SysRoleRightDao {
	
	//官方建议：使用ORM自带的APIs,目前不再推荐*Template
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	//---
	//---
	//---
	
	@Override
	public void add(SysRoleRight sysRoleRight) {
		sessionFactory.getCurrentSession()
					  .save(sysRoleRight);
		
	}

	@Override
	public void delete(SysRoleRight sysRoleRight) {
		sessionFactory.getCurrentSession()
		    		  .delete(sysRoleRight);
		
	}

	@Override
	public void update(SysRoleRight sysRoleRight) {
		sessionFactory.getCurrentSession()
					  .update(sysRoleRight);
	}

	@Override
	public SysRoleRight findById(Long id) {
		SysRoleRight sysRoleRight = sessionFactory.openSession()
					                              .get(SysRoleRight.class, id);
		return sysRoleRight;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SysRoleRight> findAll() {
		 List<?> list = sessionFactory.openSession()
				       				  .createQuery("FROM SysRoleRight")
				       				  .list();
		 return (List<SysRoleRight>) list;
	}

}
