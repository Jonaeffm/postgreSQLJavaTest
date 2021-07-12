package postgreSQLTest;

import java.io.File;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import java.io.File;  
import java.io.FileInputStream;  
import java.io.IOException;  


public class main {

		public static String insert(int i,String engl,String deu, String norsk)
		{
			
			String InsertSQL  = "INSERT INTO languages (id,german,english,norwegian) VALUES ('"+Integer.toString(i)+"', '"+deu+"', '"+engl+"', '"+norsk+"')";
			return InsertSQL;
		}
	
	
		   public static void main(String args[])  {
		   
		       try (Connection conn = DriverManager.getConnection(
		                "jdbc:postgresql://127.0.0.1:5432/jonaeffm", "jonaeffm", "jonaeffm")) {

		            if (conn != null) {
		                System.out.println("Connected to the database!");
		            } else {
		                System.out.println("Failed to make connection!");
		            }
		            
		            Statement stmt = conn.createStatement();    
		            
		            /*String InsertSql = insert(0,"Optionen","options","innstillinger");
		            
		            stmt.executeUpdate(InsertSql);

		            InsertSql = insert(1,"Start","start","start");
		            
		            stmt.executeUpdate(InsertSql);*/
		            
		            String	InsertSql = insert(2,"beenden","exit","avslutt");
		            
		            stmt.executeUpdate(InsertSql);
		            
		            InsertSql = insert(3,"Alarm aus","alarm off","alarm av");
		            
		            stmt.executeUpdate(InsertSql);
		            
		            InsertSql = insert(4,"Hauptmenü","mainmenu","hovedmeny");
		            
		            stmt.executeUpdate(InsertSql);
		            
		            InsertSql = insert(5,"Wahl","option","utvalg");
		            
		            stmt.executeUpdate(InsertSql);
		            
		            InsertSql = insert(6,"Wecker hinzufügen","add alarm clock","legg til vekkerklokke");
		            
		            stmt.executeUpdate(InsertSql);
		            
		            InsertSql = insert(7,"Wecker entfernen","remove alarm clock","fjern vekkerklokke");
		            
		            stmt.executeUpdate(InsertSql);
		            
		            InsertSql = insert(8,"Pfad und Dateiname der MP3","directory and filename of mp3","plassering og filnavn til MP3-filen");
		            
		            stmt.executeUpdate(InsertSql);
		            
		            InsertSql = insert(9,"Wecker anzeigen","show alarm clocks","vis vekkerklokke");
		            
		            stmt.executeUpdate(InsertSql);
		            
		            InsertSql = insert(10,"zurück","back","tilbake");
		            
		            stmt.executeUpdate(InsertSql);
		            
		            InsertSql = insert(11,"heute","today","i dag");
		            
		            stmt.executeUpdate(InsertSql);
		            
		            InsertSql = insert(12,"morgen","tomorrow","i morgen");
		            
		            stmt.executeUpdate(InsertSql);
		            	
		            InsertSql = insert(13,"Stunden","hours","timer");
		            
		            stmt.executeUpdate(InsertSql);
		            
		            InsertSql = insert(14,"Minuten","minutes","minutter");
		            
		            stmt.executeUpdate(InsertSql);
		            
		            InsertSql = insert(15,"Name","name","name");
		            
		            stmt.executeUpdate(InsertSql);
		            
		            InsertSql = insert(16,"Sprache","language","spraak");
		            
		            stmt.executeUpdate(InsertSql);
		            
		            InsertSql = insert(17,"Zeitzone","timezone","tidssone");
		            
		            stmt.executeUpdate(InsertSql);
		            stmt.close();

		        } catch (SQLException e) {
		            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
			  
			  
			 
		   }
		   }