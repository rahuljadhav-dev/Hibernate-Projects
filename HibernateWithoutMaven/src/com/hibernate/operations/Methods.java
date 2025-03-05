package com.hibernate.operations;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.Model.Employee;
import com.hibernate.connection.Connect;

public class Methods {

	public static List<Employee>getEMp(){
		SessionFactory sf=Connect.getCon(Employee.class);
		Session s=sf.openSession();
		Criteria q=s.createCriteria(Employee.class);
		List<Employee> list=q.list();
		return list;
	}

	public static void deleteEmp(){
		SessionFactory sf=Connect.getCon(Employee.class);
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		Query q=s.createSQLQuery("delete from employee_data");
		q.executeUpdate();
		tr.commit();

		System.out.println("Deleted....");
	}
	
	public static void insertEmp(Object emp) {
		SessionFactory sf=Connect.getCon(Employee.class);
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
		
		s.save(emp);
		tr.commit();
		s.close();
		System.out.println("Employee inserted into DB");
		
		
	}



}
