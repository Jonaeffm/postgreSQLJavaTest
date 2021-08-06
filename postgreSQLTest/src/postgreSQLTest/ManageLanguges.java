package postgreSQLTest;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Iterator;




public class ManageLanguges {
	private static SessionFactory factory;
	public void manage()
	{
		try {
			factory = new Configuration().configure().buildSessionFactory();
		}catch (Throwable ex)
		{
			System.err.println("Failed to create sessionFactory object"+ex);
			throw new ExceptionInInitializerError(ex);
		}
		
		
	}
}
