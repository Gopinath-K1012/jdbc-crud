import java.sql.*;

public class Get{
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc";
    private static final String USER = "root";
    private static final String PASSWORD = "gopi@10122002";

    public static void main(String[] args) {
        String selectQuery = "SELECT * FROM users1";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectQuery)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}