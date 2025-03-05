package com.crud.dao;

import java.io.ObjectInputFilter.Config;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.crud.config.ConfigurationOfHibernate;
import com.crud.model.Users;

public class DaoClass {
	public static List<Users>getAllUsers(){
		Session s=ConfigurationOfHibernate.getSesssion();
		Criteria c=s.createCriteria(Users.class);
		List<Users> l=c.list();
		return l;
	}
	
	public static Users getUserByID(int id){
		Session s=ConfigurationOfHibernate.getSesssion();
	    Object l=s.load(Users.class, id);
		
		return (Users) l;
	}
	
	public static Users getUserByIDget(int id){
		Session s=ConfigurationOfHibernate.getSesssion();
	    Object l=s.get(Users.class, id);
		
		return (Users) l;
	}
	
	public static String updateUserById(int id,String username){
		Session s=ConfigurationOfHibernate.getSesssion();
		Transaction t=s.beginTransaction();
		Users user=(Users) s.load(Users.class, id);
		if(user.getId()!=0) {
			user.setName(username);
			
			
		}
		s.update(user);
		t.commit();
		s.close();
	
		
		return "Updated username successfully";
	}
	
	
	public static void main(String[] args) {
		try {
			Session s=ConfigurationOfHibernate.getSesssion();
			Transaction t=s.beginTransaction();	
//			Users user1=new Users(1, "Rahul Jadhav", 25);
//			s.save(user1);
//			t.commit();
//			s.close();
			System.out.println("User Inserted....");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Problem....");
		}
		
//		System.out.println(getAllUsers());
//		System.out.println(getUserByID(2));//load throws the exception that object is not found 
//		System.out.println(getUserByIDget(2));//if data is not present in the database then is gives null value
		
		System.err.println(updateUserById(1, "RAHUL JADHAV"));
	}
	
}
