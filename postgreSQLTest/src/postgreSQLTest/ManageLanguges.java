package postgreSQLTest;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import javax.naming.Referenceable;
import java.util.Iterator;




public class ManageLanguges {
	private static SessionFactory factory ;
	public void manage()
	{
		
		try {
		
			
			Configuration cfg=new Configuration();  //create Configuration object first

			cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
			factory=cfg.buildSessionFactory(); //then u can create session factory object and u can begin your transaction

		}catch (Throwable ex)
		{
			System.err.println("Failed to create sessionFactory object"+ex);
			throw new ExceptionInInitializerError(ex);
		}
		
		ManageLanguges ML = new ManageLanguges();
		
		
		Integer empID1 = ML.addLanguages("start","Start","start");
		Integer empID2 = ML.addLanguages("exit","beenden","avslutt");
		Integer empID3 = ML.addLanguages("alarm off","Alarm aus","alarm av");
		Integer empID4 = ML.addLanguages("mainmenu","Hauptmenü","hovedmeny");
		Integer empID5 = ML.addLanguages("option","Wahl","utvalg");
		Integer empID6 = ML.addLanguages("add alarm clock","Wecker hinzufügen","legg til vekkerklokke");
		Integer empID7 = ML.addLanguages("remove alarm clock","Wecker entfernen","fjern vekkerklokke");
		Integer empID8 = ML.addLanguages("directory and filename of mp3","Pfad und Dateiname der Mp3","plassering og filnavn til MP3-filen");
		Integer empID9 = ML.addLanguages("show alarm clocks","Wecker anzeigen","vis vekkerklokke");
		Integer empID10 = ML.addLanguages("back","zurück","tilbake");
		Integer empID11 = ML.addLanguages("today","heute","i dag");
		Integer empID12 = ML.addLanguages("tomorrow","morgen","i morgen");
		Integer empID13 = ML.addLanguages("hours","Stunden","timer");
		Integer empID14 = ML.addLanguages("minutes","Minuten","minutter");
		Integer empID15 = ML.addLanguages("name","Name","name");
		Integer empID16 = ML.addLanguages("language","Sprache","Spraak");
		Integer empID17 = ML.addLanguages("timezone","Zeitzone","tidssone");
		Integer empID18 = ML.addLanguages("options","Optionen","innstillinger");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
			languagesID = (Integer) session.save(lang);
			tx.commit();
			
		}
		catch (HibernateException exc) {
			if(tx!=null) tx.rollback();
			exc.printStackTrace();
		}
		finally {
			session.close();
		}
		return languagesID;
		
	}
}
