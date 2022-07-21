package Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.util.Scanner;
public class JDBCUpdate {
	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/anound","root","root");
		
		
		
		String sql="update user set flag=? where uid=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		
		while(true) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Please enter the uid..:");
			int uid=scan.nextInt();
			System.out.println("Please enter the flag value..:");
			int flag=scan.nextInt();
		stmt.setInt(1, flag);
		stmt.setInt(2, uid);
		int noofrowschanged=stmt.executeUpdate();
		
		
		System.out.println("No of rows updated...:"+noofrowschanged);
		}
	}
}