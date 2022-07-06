package Jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCDemo2 {
	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/anound","root","root");
		
		System.out.println(con);
		
		
		String sql="update users set flag=? where uid=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		
		stmt.setInt(1, 1);
		stmt.setInt(2, 4);
		int noofrowschanged=stmt.executeUpdate();
		
		
		
		System.out.println("No of rows updated...:"+noofrowschanged);
	}
}