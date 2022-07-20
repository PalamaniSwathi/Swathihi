package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCCreate {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/anound","root","root");
		
		
		String sql="select * from user";
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt("uid")+":"+rs.getString("uname")+":"+rs.getString("upass")+":"+rs.getInt("amt")+":"+rs.getString("city")+":"+rs.getInt("flag"));
		}
		
	}

}
