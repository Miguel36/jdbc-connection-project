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
			
			CallableStatement statement = connection.prepareCall("{call getEmployeeById(?, ?, ?)}");
			statement.setInt(1, 101);
			statement.registerOutParameter(2, java.sql.Types.VARCHAR);
			statement.registerOutParameter(3, java.sql.Types.INTEGER);
			statement.executeUpdate();
			
			System.out.println("Name: " + statement.getString(2) + " Salary: " + statement.getInt(3));
			
			connection.close();		
		}
		catch (Exception e) {
			
		}
	}
}
