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
			
			String InsertSQL  = "INSERT INTO languages (id,e,g,n) VALUES ('"+Integer.toString(i)+"', '"+deu+"', '"+engl+"', '"+norsk+"')";
			return InsertSQL;
		}
	
	
		   public static void main(String args[])  {
		   
			   ManageLanguges ml = new ManageLanguges();
	            ml.manage();
	            
			   
		       /*try (Connection conn = DriverManager.getConnection(
		                "jdbc:postgresql://127.0.0.1:5432/jonaeffm", "jonaeffm", "jonaeffm")) { //<= HIER USER, PW UND DATENBANK

		            if (conn != null) {
		                System.out.println("Connected to the database!");
		            } else {
		                System.out.println("Failed to make connection!");
		            }
		            
		            Statement stmt = conn.createStatement();    
		            
		            //String createSql = "CREATE TABLE languages (id int,e varchar (255),g varchar(255),n varchar(255))";
		            
		           // stmt.executeUpdate(createSql);
		            
		            ManageLanguges ml = new ManageLanguges();
		            ml.manage();
		            

		           /* ResultSet rs = stmt.executeQuery( "select * from languages ;" );
		            
		            while ( rs.next() ) {

		                int albumid = rs.getInt("id");

		                String  german = rs.getString("german");
		                
		                String  english = rs.getString("english");

		                String  norwegian = rs.getString("norwegian");

		                System.out.printf( "Id = %s , german = %s, english = %s, norwegian= %s ", albumid,german, english,norwegian );

		                System.out.println();

		             }

		            // rs.close();
		            stmt.close();

		        } catch (SQLException e) {
		            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		        } catch (Exception e) {
		            e.printStackTrace();
		        }*/
			  
			  
			 
		   }
		   }