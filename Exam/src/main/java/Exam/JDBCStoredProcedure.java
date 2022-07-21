package Exam;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet( "*.do")
public class JDBCStoredProcedure extends HttpServlet {
	@Override
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("uname");
		String password=request.getParameter("upass");
		PrintWriter out=response.getWriter();
		if(name.equals("veena")) {
			out.print("<h1>Welcome ........</h1>");
		}
		else {
			
			RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
		System.out.println("service method called..");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/anound","root","root");

			System.out.println(con);
			
			
			String sql="select * from users";
			Statement stmt=con.createStatement();
			boolean result=stmt.execute(sql);
		
			
			System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		
		
	   

		}
	

	
	

