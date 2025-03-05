package com.crud.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HBConnect {
	public static Session getC(Class cl) {
		try {
			Configuration c=new Configuration();
			c.addAnnotatedClass(cl);
			c.configure("hibernate.cfg.xml");
			
			SessionFactory sf=c.buildSessionFactory();
			Session s= sf.openSession();
			return s;
		} catch (Exception e) {
			return null;
		}
	}

}
