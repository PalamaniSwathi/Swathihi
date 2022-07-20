package Services;
import java.util.Enumeration;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class PurchaseAction extends Action{
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		Enumeration em=request.getParameterNames();
		
		HttpSession hs=request.getSession();
		String next=request.getParameter("shop");
		
		while(em.hasMoreElements()) {
			
			String name=em.nextElement().toString();
			
			String value=request.getParameter(name);
			
			hs.setAttribute(name,value);
			
		}
		
		return next;
		
	}
}