package com.crud.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.crud.model.Users;

public class ConfigurationOfHibernate {
	public static Session getSesssion() {
		Configuration c=new Configuration();
		c.addAnnotatedClass(Users.class);
		c.configure("hibernate_cfg.xml");
		
	
		SessionFactory s=c.buildSessionFactory();
		Session ss=s.openSession();
		return ss;
	}

}
