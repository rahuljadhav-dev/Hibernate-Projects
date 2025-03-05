package com.all.hibernate.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.all.hibernate.entity.Employee;
import com.all.hibernate.util.HibernateUtil;



public class CrudOperations {
	private static final SessionFactory sf=HibernateUtil.sessionFc();

	 
	 public static String insertEmployee(Employee employee) {
		 try (Session session=sf.openSession()){
			 Transaction transaction=session.beginTransaction();
			 if(employee!=null) {
				 session.persist(employee);
				 transaction.commit();
			 }
			 return "Emlpoyee successfully inserted";
		} catch (Exception e) {
			System.out.println("Error while inserting the employee");
		}
		 return null;
	 }
	 
	 public static void getEmployeeByID(int id) {
		 try (Session session=sf.openSession()){
			 Employee e=session.get(Employee.class, id);
	
			 System.out.println("Id of employee :"+e.getId());
			 System.out.println("Name Of employee :"+e.getName());
			 System.out.println("Designation of employee  :"+e.getDesignation());
			 System.out.println("Salary of employee :"+e.getSalary());
			 System.out.println("About employee :"+e.getAbout());
			 System.out.println("Laptop Allocated :"+e.getLaptop().getName()+" With Id:"+e.getLaptop().getId());
			 
			
		} catch (Exception e) {
			
		}
	 }
	
	 public static String updateEmployeeById(int id,Employee employee) {
		 try(Session session=sf.openSession()) {
			 Transaction transaction=session.beginTransaction();
			 Employee e=session.get(Employee.class, id);
			 if(e!=null) {
				 e.setName(employee.getName());
				 e.setAbout(employee.getAbout());
				 e.setDesignation(employee.getDesignation());
				 e.setSalary(employee.getSalary());
				 e.setLaptop(employee.getLaptop());
				 
				 session.merge(e);
				 transaction.commit();
				 return "Employee updated successfully...";
			 }
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Something went wrong..");
		}
		 return null;
	 }
	 
	 public static String deleteEmployeeByID(int id) {
		 try (Session session=sf.openSession()){
			 Transaction transaction=session.beginTransaction();
			 Employee e=session.get(Employee.class, id);
			 if(e.getId()==id) {
				 session.remove(e);
				 transaction.commit();
				 return "Employee deleted successfully..";
			 }
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Something went wrong");
		}
		 return null;
	 }
	 
	 public static List<Employee>getAllEmployees(){
		 try(Session session=sf.openSession()) {
			 String hql="FROM Employee";
			Query<Employee>emp=session.createQuery(hql);
			return emp.list();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Something went wrong");
		}
		 return null;
	 }
	 
	 public static Employee getEmployeeByName(String name) {
		 try(Session session=sf.openSession()) {
			 String hql="FROM Employee WHERE name=:name";
			 Query<Employee>q=session.createQuery(hql,Employee.class);
			 q.setParameter("name", name);
			 return q.uniqueResult();
			
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
		 return null;
	 }

}
