import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args )
    {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = ""; // replace with the password of the user

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to the database!");
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
    }
    
}
