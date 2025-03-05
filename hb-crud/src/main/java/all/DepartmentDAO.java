package all;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hb.connect.ConnectHB;

import java.util.List;

public class DepartmentDAO {

	public void saveDepartment(Department department) {
		Session s=ConnectHB.getCon();
		Transaction t=s.beginTransaction();
		s.save(department);
		t.commit();

	}

	public Department getDepartmentById(int id) {

		Department department = null;
		Session s=ConnectHB.getCon();
		Transaction t=s.beginTransaction();
		department = s.get(Department.class, id);
		// Commit the transaction
		t.commit();

		return department;
	}

	public List<Department> getAllDepartments() {
		Transaction transaction = null;
		List<Department> departments = null;
		try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
			// Start a transaction
			transaction = session.beginTransaction();
			// Get a list of departments
			departments = session.createQuery("from Department", Department.class).list();
			// Commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return departments;
	}

	public void updateDepartment(Department department) {
		Transaction transaction = null;
		try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
			// Start a transaction
			transaction = session.beginTransaction();
			// Update the department object
			session.update(department);
			// Commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public void deleteDepartment(int id) {
		Transaction transaction = null;
		try (Session session = new Configuration().configure().buildSessionFactory().openSession()) {
			// Start a transaction
			transaction = session.beginTransaction();
			// Get the department object
			Department department = session.get(Department.class, id);
			if (department != null) {
				// Delete the department object
				session.delete(department);
			}
			// Commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}

