import java.sql.*;

public class Update {
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc";
    private static final String USER = "root";
    private static final String PASSWORD = "gopi@10122002";

    public static void main(String[] args) {
        String updateQuery = "UPDATE users1 SET email =? WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {

            preparedStatement.setString(1, "updated.email@example.com");
            preparedStatement.setInt(2, 102); // Update the user with ID 1
            int rowsUpdated = preparedStatement.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}