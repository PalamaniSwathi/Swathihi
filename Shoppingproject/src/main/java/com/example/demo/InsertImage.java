package com.example.demo;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class InsertImage {
	

		public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anound", "root", "root");
				System.out.println(con);
				String qury = "insert into cooldrinks values(?,?,?)";
				PreparedStatement ps = con.prepareStatement(qury);
				ps.setString(1, "Maaza");
				FileInputStream fis = new FileInputStream("C:\\Users\\swathi.palamani\\Downloads\\Maaza.jpg");
				ps.setBinaryStream(3, fis, fis.available());
				ps.setString(2, "50");
				int a = ps.executeUpdate();
				System.out.println(a);
			} catch (ClassNotFoundException | SQLException | IOException e) {
				e.printStackTrace();
			}
		
	}

}
