package com.all.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	static {
		try {
			if(sessionFactory==null) {
				sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			}
		
		} catch (Exception e) {
			throw new RuntimeException("Error in creation..");
		}
	}
	
	public static SessionFactory sessionFc() {
		return sessionFactory;
	}

}
