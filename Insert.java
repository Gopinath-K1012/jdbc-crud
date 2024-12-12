import java.sql.*;

public class Insert {
	public static void insertstudent() throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "gopi@10122002";
        String query = "insert into users1 values (?,?,?,?)";
		
        Connection con = DriverManager.getConnection(url,username,password);
		
        PreparedStatement pst = con.prepareStatement(query);
		
        pst.setInt(1,103);
		pst.setString(2,"abs");
		pst.setString(3,"adc@gmail.com");
		pst.setInt(4,12344);
		pst.executeUpdate();
		con.close();
	}

	public static void main (String args[]) throws Exception {
	insertstudent();
	
}
}