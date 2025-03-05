import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainClass {
	public static void main(String[] args) {
		SessionFactory sf= ConnectionClass.letsConnect(EmployeeEntity.class);
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		EmployeeEntity one=new EmployeeEntity();
		one.setName("Rahul Jadhav");
		one.setSalary(55000);
		one.setAddress("Pune");
		
		s.save(one);
		t.commit();
		s.close();
	}

}
