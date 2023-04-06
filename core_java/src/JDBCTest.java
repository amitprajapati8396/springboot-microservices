import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	public static void main(String[] args) throws Exception {
		Class.forName("org.postgresql.Driver");
//try with new operator to load Driver class	
		
		try(
				Connection con =DriverManager.getConnection
		        ("jdbc:postgresql://localhost:5432/testdb", "postgres", "Password@123");
				
		        Statement stmt =con.createStatement(); 
		){
			try( ResultSet  executeQuery = stmt.executeQuery("SELECT * FROM COMPANY");)
			{
			
				System.out.println("Connection established successfully");
			   
			    //Creating a new Table into DB
		        
	//	        String sql = "CREATE TABLE COMPANY " +
	//	           "(ID INT PRIMARY KEY NOT NULL," +
	//	           " NAME TEXT NOT NULL, " +
	//	           " AGE INT NOT NULL, " +
	//	           " ADDRESS CHAR(50), " +
	//	           " SALARY REAL)";
	//	        stmt.executeUpdate(sql);
		        
		        //Inserting data into Company table
		        
	//	        String query = "INSERT INTO COMPANY VALUES(102,'Subham',29,'Mumbai',40000)";
	//	        int x = stmt.executeUpdate(query);
	//	        System.out.println(x +" row inserted successfully.");
		        
		        //fetching data from DB
		    //    System.out.println("=============Fetched data from DB===============");
		       
		         while(executeQuery.next()){
		        	 System.out.println(executeQuery.getInt(1) + " " + executeQuery.getString(2) + " "
		        			            +executeQuery.getInt(3) + " "+ executeQuery.getString(4)+" "
		        			            +executeQuery.getInt(5));
		         }
		         
		      //try using hasNext()   
		         
		         //Updating Data into DB
		         System.out.println("============Data updated successfully===========");
		         String update = "UPDATE COMPANY SET SALARY=45000 WHERE id=102";
		         int x = stmt.executeUpdate(update);
		         System.out.println(x + " row updated successfully.");
		         
		         //Deleting data from DB
		         System.out.println("============Deleted data from DB==============");
		         
		         int delete = stmt.executeUpdate("DELETE FROM COMPANY WHERE id = 101");
		         System.out.println(delete + " row delete successfully.");
		         
		         //fetching data from DB
		         System.out.println("============Fetched data from DB==============");
		         
		         ResultSet rs = stmt.executeQuery("SELECT * FROM COMPANY");
		         while(rs.next()){
		        	 System.out.println(rs.getInt(1) + " " + rs.getString(2) + " "
		        			            +rs.getInt(3) + " "+ rs.getString(4)+" "
		        			            +rs.getInt(5));
		         }
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
}
