import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatementTest {
	
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USERNAME = "system";
	public static final String PASSWORD = "12345";
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			CallableStatement statement = connection.prepareCall("{call insertEmployee(?, ?, ?)}");
			statement.setInt(1, 101);
			statement.setString(2, "EmployeeA");
			statement.setInt(3, 10000);
			int result = statement.executeUpdate();
			
			System.out.println("Number of rows affected: " + result);
			
			connection.close();		
		}
		catch (Exception e) {
			
		}
	}
}
