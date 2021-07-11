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
		            
		            String InsertSql = insert(0,"Optionen","options","innstillinger");
		            
		            stmt.executeUpdate(InsertSql);

		            InsertSql = insert(1,"Start","start","start");
		            
		            stmt.executeUpdate(InsertSql);
		            
		            stmt.close();

		        } catch (SQLException e) {
		            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
			  
			  
			 
		   }
		   }