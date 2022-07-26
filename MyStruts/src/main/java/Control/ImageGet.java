package Control;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ImageGet")
public class ImageGet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  response.setContentType("image/jpg");
		  String name =request.getParameter("name");
		  String shopname =request.getParameter("shopname");
		  try {
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anound","root","root");
		  String sql = "SELECT * FROM "+shopname+" WHERE name =?";
		  PreparedStatement ps = con.prepareStatement(sql);
		  
		  ps.setString(1, name);
		   ResultSet rs = ps.executeQuery();
		   if(rs.next()){
		    byte [] imageData = rs.getBytes("img"); 
		    OutputStream os = response.getOutputStream(); 
		             os.write(imageData);
		             os.flush();
		             os.close();
		   }
		  } catch (SQLException e) {
		 
		   e.printStackTrace();
		   response.getOutputStream().flush();
		   response.getOutputStream().close();
		  }
		  
		 }

}