import java.sql.*;

public class JDBCExample {


	static final String DB_URL = "jdbc:mysql://localhost/sakila";

	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement stmt = conn.createStatement();) {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			String sql = "select first_name FROM actor";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(", First: " +  rs.getString("first_name"));
			}
			rs.close();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
