package com.hibernate.practice;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Expression;

public class MainClass {
	public static void main(String[] args) {
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		c.addAnnotatedClass(ProjectH.class);
		
		SessionFactory sf= c.buildSessionFactory();
	    Session	s= sf.openSession();
		Transaction t=s.beginTransaction();
		
		ProjectH ph=new ProjectH(134,"Soham Jadhav","Contractor");
		s.save(ph);
		t.commit();
		s.close();
		System.out.println("Successfully inserted....");
		
//		Criteria cr=s.createCriteria(ProjectH.class);
//		cr.add(Expression.eq("id", 507));
//		List list= cr.list();
//		
//		System.out.println(list+" ");
		
//		Query q=s.createQuery("update ProjectH set name='Ashu Jadhav' where id=507 ");
//		q.executeUpdate();
//		t.commit();
//		
//		System.out.println("Update successfully....");
		
		
		
	}

}
