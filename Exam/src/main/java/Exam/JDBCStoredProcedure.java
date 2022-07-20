package Exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebInitParam;
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
		
	   

}
	
	}

