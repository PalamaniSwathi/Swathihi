package Jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCDemo5 {
	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/anound","root","root");
		
		System.out.println(con);
		
		
		String sql="select * from users where uname=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		
		stmt.setString(1, "rani");
		ResultSet rs=stmt.executeQuery();
		
		
		
		if(rs.next()) {
			System.out.println(rs.getInt("uid")+":"+rs.getString("uname")+":"+rs.getInt("amt"));
		}
	}
}