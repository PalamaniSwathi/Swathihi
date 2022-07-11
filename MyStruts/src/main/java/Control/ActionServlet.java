package Control;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("*.do")
public class ActionServlet extends HttpServlet {
	
	RequestProcesser rp;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		rp=new RequestProcesser();
		
		String path=config.getServletContext().getRealPath("/WEB-INF/config.properties");
		
		config.getServletContext().setAttribute("path", path);
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		rp.process(request, response);
		
	}
	
	@Override
	public void destroy() {
		
		System.out.println("Old deleted.............");
		
	}
}