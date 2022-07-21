package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JDBCRetrive {
	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/anound","root","root");
		
		
		
		
		String sql="select * from user where uname=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		
		stmt.setString(1, "rani");
		ResultSet rs=stmt.executeQuery();
		
		
		
		ResultSetMetaData rsmd=rs.getMetaData();
		int colcount=rsmd.getColumnCount();
		for(int i=1;i<=colcount;i++) {
			System.out.print(rsmd.getColumnName(i)+"\t");
		}
		System.out.println("\n=====================================================\n");
		if(rs.next()) {
			for(int i=1;i<=colcount;i++) {
				System.out.print(rs.getString(i)+"\t");
			}
		}
	}

}