package hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateSetup {
	
	public static Session getSession() {
		try {
			Configuration c=new Configuration();
			System.out.println(4);
			c.addAnnotatedClass(Testing.class);
			System.out.println(5);
			c.configure();
			System.out.println(6);
			SessionFactory sf=c.buildSessionFactory();
			System.out.println(7);
			Session s=sf.openSession();
			System.out.println(8);
			
			return s;
		
		
		} catch (Exception e) {
			System.out.println("Error occurs during connection");
		}
		System.out.println(9);
		return null;
	}
	
	public static void main(String[] args) {
		Session s=HibernateSetup.getSession();
		Transaction t=s.beginTransaction();
		Testing one=new Testing(52,"Harish M");
//		one.setName("Omkar A");
//		s.persist(one);
//		t.commit();
//		s.close();
//		int id=; 
//		Testing ts=s.load(Testing.class, id);
//		System.out.println(ts);
		
		s.detach(one);
		
		
		s.remove(one);
		t.commit();
		s.close();
		
		System.out.println("data saved...");
		
	}

}
