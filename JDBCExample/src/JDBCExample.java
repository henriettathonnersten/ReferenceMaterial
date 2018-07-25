import java.sql.*;
public class JDBCExample {


	   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/sakila";

	   static final String USER = "root";
	   static final String PASS = "root";
	   
	   public static void main(String[] args) {
	 
	
	   try( Connection conn =DriverManager.getConnection(DB_URL,USER,PASS);
			  Statement stmt = conn.createStatement();) {
	      Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	      System.out.println("Connecting to database...");
	      System.out.println("Creating statement...");
	      String sql;
	      sql = "select first_name FROM actor";
	      ResultSet rs = stmt.executeQuery(sql);
	      while(rs.next()){
	         String first = rs.getString("first_name");	      
	         System.out.print(", First: " + first);
	      }
	      rs.close();
	   }catch(SQLException se){
	      se.printStackTrace();
	   }catch(Exception e){
	      e.printStackTrace();
	   }
	   }
	   }
