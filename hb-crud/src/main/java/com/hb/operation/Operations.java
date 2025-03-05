package com.hb.operation;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hb.connect.ConnectHB;
import com.hb.entity.Employee;

public class Operations {
	public void insertData(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter ID");
		int id=scanner.nextInt();

		System.out.println("Enter Name");
		String name=scanner.next();
		scanner.nextLine();

		System.out.println("Enter Designation");
		String desig=scanner.next();

		scanner.nextLine();

		System.out.println("Enter Salary");
		long salary=scanner.nextLong();


		Employee e=new Employee(id,name,desig,salary);

		Session s=ConnectHB.getCon();
		Transaction t= s.beginTransaction();
		s.save(e);
		t.commit();
		s.close();
		System.out.println("Data inserted successfully....");

	}
	
	public void showData() {
		Session s=ConnectHB.getCon();
		Query q=s.createQuery("from Employee");
		List<Employee> list=q.list();
		for (Employee employee : list) {
			System.out.println(employee.getEmployeeName());
			
		}
		System.out.println(list);
		
		
	}

}
