package com.all.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.all.hibernate.crud.CrudOperations;
import com.all.hibernate.entity.Employee;
import com.all.hibernate.entity.Laptop;
import com.all.hibernate.util.HibernateUtil;




public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //operation
        SessionFactory sf=HibernateUtil.sessionFc();
//        System.out.println(sf);
        
        Session session=null;
        Transaction transaction=null;
        try {
        	session=sf.openSession();
        	transaction=session.beginTransaction();
        	
        	//try with employee
        	Employee e1=new Employee("Omkar Adkine", "Supervisor", (long) 25000, "He is Very Hardworking Employee");
        CrudOperations.insertEmployee(e1);
        	Laptop l=new Laptop();
        	l.setName("Lenovo");
        	l.setEmployee(e1);
        	e1.setLaptop(l);
//        	
			session.persist(e1);
			transaction.commit();
			
			System.out.println("Employee Inserted Successfully...");
		} catch (Exception e) {
			if(transaction!=null) {
				transaction.rollback();
			}
//			throw new RuntimeException("Something went wrong in operation");
			e.printStackTrace();
		}finally {
			session.close();
		}
        
        
    }
}
