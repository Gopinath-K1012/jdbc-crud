import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "gopi@10122002";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
