package com.hibernate.main;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.Model.Employee;
import com.hibernate.connection.Connect;
import com.hibernate.operations.Methods;

public class MainClass {
	public static void main(String[] args) {
//		SessionFactory sf=Connect.getCon(Employee.class);
//		Session session=sf.openSession();
//		Transaction tr=session.beginTransaction();
		Employee one=new Employee(509, "Rahul Jadhav", 50, "Software Developer",990000);
		Employee two=new Employee(5077, "Ashu Jadhav", 50, "Software Developer",990000);
		Employee three=new Employee(50888, "Soham Jadhav", 50, "Software Developer",990000);
//		
//		session.save(one);
//		session.save(two);
//		session.save(three);
//		tr.commit();
//		session.close();
//		System.out.println("Hibernate Successfull....");
		
		List<Employee> list=Methods.getEMp();
		
		for (Employee employee : list) {
			if(employee.id<5000) {
				System.out.println("ID :"+employee.id+" Name :"+employee.name);
				
			}	
		}

		
//		Methods.deleteEmp();
		
//		Methods.insertEmp(three);
		
	}

}
