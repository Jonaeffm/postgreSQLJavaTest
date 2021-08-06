package postgreSQLTest;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
		
		ManageLanguges ML = new ManageLanguges();
		
		//Integer empID0 = ML.addLanguages
	}
	
	public Integer addLanguages(String e,String g,String n)
	{
		Session session =factory.openSession();
		Transaction tx = null;
		Integer languagesID = null;
		
		try
		{
			tx = session.beginTransaction();
			languages lang = new languages(e,g,n);
			
		}
		catch (HibernateException exc) {
			
		}
		return null;
		
	}
}
