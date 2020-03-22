import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CRUDTest {
	
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; 
	public static final String USERNAME = "system"; 
	public static final String PASSWORD = "12345"; 
		
	public static void main(String[] args) {		
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate("CREATE TABLE Employee(emp_id INT, emp_name VARCHAR2(30), emp_salary INT)");
			
			System.out.println("Number of rows affected: " + result);
			connection.close();
			
			
			
			
			
		}
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	}
}
