import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTest {

    public static void main(String[] args){

        try {
            System.out.println("Connecting to the database");

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "system", "12345");

                System.out.println("Conection stablished!!!");
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

	
}
