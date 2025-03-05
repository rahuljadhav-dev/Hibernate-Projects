import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ConnectionClass {
	public static SessionFactory letsConnect(Class name) {
		Configuration c=new Configuration();
		c.configure();
		c.addAnnotatedClass(name);
		SessionFactory sf=c.buildSessionFactory();
		return sf;
		
	}

}
