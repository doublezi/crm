package com.crm.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp.Factory;

public class HibernateUtils {
	
	/**
	 * 
	 * @return ����һ��{@link org.hibernate.Transaction}����{@code factory}
	 */
	public static SessionFactory getFactory() {
		 Configuration configuration = new Configuration();
		 configuration.configure();
		 SessionFactory factory = configuration.buildSessionFactory();
		 return factory;
	}
	
	/**
	 * @return ����һ��{@link org.hibernate.Session}����{@code session}
	 */
	public static Session getSession() {
		SessionFactory factory = getFactory();
		Session session = factory.openSession();
		return session;
	}
	
	/**
	 * @return ����һ���������{@code transaction},���ڿ�������
	 */
	public static Transaction getTransaction() {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		return transaction;
	}

	/**
	 * 1. �ر�session<br/>
	 * 2. �ر�factory
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
