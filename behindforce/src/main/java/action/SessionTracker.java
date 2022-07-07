package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SessionTracker")
public class SessionTracker extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        response.setContentType("text/html");
	        PrintWriter out=response.getWriter();
	        HttpSession session=request.getSession(true);
	        Integer count=(Integer)session.getValue("tracker.count");
	        if(count==null)count=new Integer(1);
	        else count=new Integer(count.intValue()+1);
	        session.putValue("tracker.count", count);
	        out.println("<html><head><title>SessionTracker</title></head>");
	        out.println("<body><h1>Session Trancking Demo</h1>");
	        out.println("you've visited this page"+count+((count.intValue()==1)?"time":"times"));
	        out.println("<p>");
	        out.println("<h2>Here is your session data:</h2>");
	        String[]names=session.getValueNames();
	        for(int i=0;i<names.length;i++)
	        {
	        	out.println(names[i]+":"+session.getValue(names[i])+"<br>");
	        }
	        out.println("</body></html>");
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
