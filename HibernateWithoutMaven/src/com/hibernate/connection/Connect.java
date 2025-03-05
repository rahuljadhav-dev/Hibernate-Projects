package com.hibernate.connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Connect {
	
	public static SessionFactory getCon(Class cl) {
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		c.addAnnotatedClass(cl);
		
		SessionFactory sf=c.buildSessionFactory();
		return sf;
		
	}

}
