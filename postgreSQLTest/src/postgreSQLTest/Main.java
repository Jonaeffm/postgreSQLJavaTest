package postgreSQLTest;


public class Main {

		public static String insert(int i,String engl,String deu, String norsk)
		{
			
			String InsertSQL  = "INSERT INTO languages (id,e,g,n) VALUES ('"+Integer.toString(i)+"', '"+deu+"', '"+engl+"', '"+norsk+"')";
			return InsertSQL;
		}
	
	
		   public static void main(String args[])  {
	
		            ManageLanguges ml = new ManageLanguges();
		            ml.manage();
		  }
}