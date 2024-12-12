import java.sql.*;

public class Delete {
    private static final String url = "jdbc:mysql://localhost:3306/jdbc";
    private static final String user = "root";
    private static final String password = "gopi@10122002";

    public static void main(String[] args) {
        String deleteQuery = "DELETE FROM users1 WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {

            preparedStatement.setInt(1, 101); // Delete the user with ID 1
            int rowsDeleted = preparedStatement.executeUpdate();
            System.out.println(rowsDeleted + " row(s) deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}