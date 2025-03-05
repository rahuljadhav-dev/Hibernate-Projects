package com.crud.operations;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.crud.connection.HBConnect;
import com.crud.entity.Employee;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for insert the data :");
		System.out.println("Enter 2 for read the data :");
		System.out.println("Enter 3 for update the data :");
		System.out.println("Enter 4 for delete the data :");
		System.out.println("Enter 5 for exit :");
		Session s=HBConnect.getC(Employee.class);
		Transaction t=s.beginTransaction();
		
		short num=sc.nextShort();
		switch(num) {
		case 1:
			System.out.println("Fill the details :");
			System.out.println("Enter ID :");
			int id=sc.nextInt();
			
			System.out.println("Enter Name :");
			String name=sc.next();
			
			sc.next();
			
			System.out.println("Enter Designation :");
			String designation=sc.next();
			
			
			System.out.println("Enter salary :");
			long salary=sc.nextLong();
			
			
			Employee e=new Employee(id,name,designation,salary);
			
			s.save(e);
			t.commit();
			s.close();
			
			break;	
		case 2:
			Criteria cr=s.createCriteria(Employee.class);
			List list=cr.list();
			
			System.out.println("Employees Data :"+list);
			
			break;
			
		case 3:
			//update
			Query qq=s.createQuery("update Employee set name='Rahul j' where id=7088");
			qq.executeUpdate();
			t.commit();
			s.close();
			
			
			
			break;
			
		case 4:
			Query q=s.createQuery("delete from Employee where id=876");
			q.executeUpdate();
			t.commit();
			System.out.println("Employee deleted..");
		
			break;
			
		}	
	}
}
