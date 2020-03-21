import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTest {

    public static void main(String[] args){

        try {
            System.out.println("Connecting to the database");

            Class.forName("oracle.jdbc.driver.OracleDriver");
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

	
}
