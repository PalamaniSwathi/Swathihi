package Jdbcpack;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDemo9 {
	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/anound","root","root");
		
		System.out.println(con);
		
		
		String sql="{call proc2(?,?)}";
		
		CallableStatement cs=con.prepareCall(sql);
		cs.setString(1, "ton");
		cs.setInt(2, 1);
		
		int noofchanges=cs.executeUpdate();
		
		
		System.out.println("No of changes..:"+noofchanges);
		
	}
}