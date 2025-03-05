package com.hb.connect;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hb.entity.Employee;

import all.Department;

public class ConnectHB {
	
	public static Session getCon() {
	 Configuration c=new Configuration();
	 c.configure("hibernate.cfg.xml");
	 c.addAnnotatedClass(Department.class);
	  SessionFactory sf=c.buildSessionFactory();
	  Session s=sf.openSession();
	  return s;
	}
	
	
	

}
