package com.crm.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp.Factory;

public class HibernateUtils {
	
	/**
	 * 
	 * @return 返回一个{@link org.hibernate.Transaction}对象{@code factory}
	 */
	public static SessionFactory getFactory() {
		 Configuration configuration = new Configuration();
		 configuration.configure();
		 SessionFactory factory = configuration.buildSessionFactory();
		 return factory;
	}
	
	/**
	 * @return 返回一个{@link org.hibernate.Session}对象{@code session}
	 */
	public static Session getSession() {
		SessionFactory factory = getFactory();
		Session session = factory.openSession();
		return session;
	}
	
	/**
	 * @return 返回一个事务对象{@code transaction},用于开启事务
	 */
	public static Transaction getTransaction() {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		return transaction;
	}

	/**
	 * 1. 关闭session<br/>
	 * 2. 关闭factory
	 */
	public static void closeAll(Session session) {
		
		if(session.isOpen()) {
			session.flush();
			session.close();
		}else {
			new Exception().getStackTrace();
		}
		
	}
}
