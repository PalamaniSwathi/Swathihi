package Jdbcpack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo11 {

	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/anound","root","root");
		
		System.out.println(con);
		
		
		String sql="select * from users";
		Statement stmt=con.createStatement();
		boolean result=stmt.execute(sql);
	
		
		System.out.println(result);
	}
}







