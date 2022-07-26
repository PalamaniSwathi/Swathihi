package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
	public static void main(String[] args) {
		insertUser();
		retriveUserById();
		updateUserUidbyflag();
		deleteUserById();
	}
	
	public JDBC() {
		try {
			Class.forName("com.mysql.cj.jdbc.driver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static void insertUser(){
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/anound","root","root");
			String sql="insert into users(uid,uname,upass,amt,city,flag)"+"values(1,'Ravi','spider',3000,'Nellore',0)";
			Statement st=con.createStatement();
		    int executeUpdate=st.executeUpdate(sql);
		    if(executeUpdate==1) {
		    	System.out.println("user is created...");
		    }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static void retriveUserById(){
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/anound","root","root");
			String sql="select * from user where uname=?";
			PreparedStatement stmt=con.prepareStatement(sql);
			
			stmt.setString(1, "rani");
			ResultSet rs=stmt.executeQuery();
			
			
			
			if(rs.next()) {
				System.out.println(rs.getInt("uid")+":"+rs.getString("uname")+":"+rs.getInt("amt"));
		    }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static void updateUserUidbyflag(){
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/anound","root","root");
			String sql="Update user set flag=1 where uid=3";
			Statement st=con.createStatement();
		    int executeUpdate=st.executeUpdate(sql);
		    if(executeUpdate==1) {
		    	System.out.println("user is updated...");
		    }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteUserById() {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/anound","root","root");
			String sql="Delete from user where uid=2";
			Statement st=con.createStatement();
		    int executeUpdate=st.executeUpdate(sql);
		    if(executeUpdate==1) {
		    	System.out.println("user is deleted...");
		    }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
