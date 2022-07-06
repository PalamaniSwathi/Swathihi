package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Para")
public class Para extends HttpServlet {
	
 

public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	   res.setContentType("text/html");
	   PrintWriter pw=res.getWriter();
	   //Get enumeration of parameter names
	   Enumeration e=req.getParameterNames();
	   //display parameter names and values
	   while(e.hasMoreElements()) {
		   String pname=(String)e.nextElement();
		   String pvalue=req.getParameter(pname);
		   pw.println(pname+":"+pvalue);
		   
	   }
	   pw.close();
	}

}
