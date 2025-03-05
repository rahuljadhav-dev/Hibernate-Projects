package com.mongo.insert;

import com.mongo.model.Student;
import com.mongo.util.HibernateUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class InsertStudent {
	public static void main(String[] args) {
		EntityManager manager=HibernateUtil.getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		try {
			transaction.begin();
			
			Student one=new Student(777, "Rahul Jadhav", 25);
			manager.persist(one);
			transaction.commit();
			System.out.println("Student saved succefully..");
		} catch (Exception e) {
			if(transaction.isActive()) {
				transaction.rollback();
			}
			System.out.println("oops....");
		}
		finally {
			manager.close();
		}
	}

}
