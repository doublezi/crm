package com.crm.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.crm.dao.SysUserDao;
import com.crm.pojo.SysUser;

public class SysUserDaoImpl implements SysUserDao {
	
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	

	//-------------------------------------------------------------------

	
	@Override
	public void add(SysUser sysUser) {
		Session session = sessionFactory.getCurrentSession();
		session.save(sysUser);
	}

	@Override
	public void delete(SysUser sysUser) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(sysUser);
	}

	@Override
	public void update(SysUser sysUser) {
		Session session = sessionFactory.getCurrentSession();
		session.update(sysUser);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void updatePassword(long userId ,String newPassword) {
		Session session = sessionFactory.getCurrentSession();
		String hql="UPDATE SysUser su "
				  + "SET "
				  + "su.userPassword= :newPassword "
				  + "WHERE "
				  + "su.userId= :userId";
		Query<SysUser> query = session.createQuery(hql);
		query.setParameter("newPassword", newPassword);
		query.setParameter("userId", userId);
		query.executeUpdate();
	}
	
	@Override
	public SysUser findById(long id) {
		Session session = sessionFactory.getCurrentSession();
		SysUser sysUser = session.get(SysUser.class, id);
		return sysUser;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SysUser> findAll() {
		Session session = sessionFactory.openSession();
		Query<SysUser> query = session.createQuery("FROM SysUser");
		List<SysUser> sysUsers = query.list();
		return sysUsers;
	}
	//-------------------------------------------------------------------

	
	
	//===================================================================
	
	/**
	 * 验证用户名和密码
	 */
	@SuppressWarnings("unchecked")
	@Override
	public SysUser validate(String username, String userpassword) {
		Session session = sessionFactory.openSession();
		String hql= " FROM SysUser su "
				  + " WHERE "
				  + " su.userName=:username "
				  + " AND "
				  + " su.userPassword=:userpassword ";
		Query<SysUser> query = session.createQuery(hql);
		query.setParameter("username", username);
		query.setParameter("userpassword", userpassword);
		List<SysUser> list = query.list();
		if(list.size()!=0) {
			return list.get(0);
		}else {
			return null;
		}
	}




	
	
	//===================================================================
	
}
