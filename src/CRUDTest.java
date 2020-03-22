import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class CRUDTest {
	
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; 
	public static final String USERNAME = "system"; 
	public static final String PASSWORD = "12345"; 
		
	public static void main(String[] args) {		
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
//      	CRUD Statement			
//			Statement statement = connection.createStatement();
//			int result = statement.executeUpdate("CREATE TABLE Employee(emp_id INT, emp_name VARCHAR2(30), emp_salary INT)");
//			int result = statement.executeUpdate("INSERT INTO Employee VALUES (103, 'EmployeeC', 30000)");
//			int result = statement.executeUpdate("UPDATE Employee SET emp_salary = 15000 WHERE emp_id = 101");
//			int result = statement.executeUpdate("DELETE FROM Employee");
			
			
//			CRUD PreparedStatement			
//			PreparedStatement pStatement = connection.prepareStatement("INSERT INTO Employee VALUES (?,?,?)");
//			pStatement.setInt(1, 103);
//			pStatement.setString(2, "EmployeeC");
//			pStatement.setInt(3, 30000);
//			int result = pStatement.executeUpdate();
			
//			PreparedStatement pStatement = connection.prepareStatement("UPDATE Employee SET emp_salary = ? WHERE emp_id = ?");
//			pStatement.setInt(1, 25000);
//			pStatement.setInt(2, 102);
//			int result = pStatement.executeUpdate();
			
			
			PreparedStatement pStatement = connection.prepareStatement("DELETE FROM Employee WHERE emp_salary >= ?");
			pStatement.setInt(1, 10000);
			int result = pStatement.executeUpdate();
			
			System.out.println("Number of rows affected: " + result);
			connection.close();
			
			
		}
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	}
	
	
}
