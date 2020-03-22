import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {

    public static void main(String[] args){

        try {
        	System.out.println("Connecting to the database");
	
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        Connection connection = DriverManager.getConnection(
	                "jdbc:oracle:thin:@localhost:1521:xe", "system", "12345");
	
	        System.out.println("Conection stablished!!!");
	        System.out.println();
	        
	        Statement statement = connection.createStatement();
	        ResultSet resultSet = statement.executeQuery("SELECT * FROM students");
	        
	        while (resultSet.next()) {
	        	System.out.println("--> " + resultSet.getString("NAME"));
	        }
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

	
}
