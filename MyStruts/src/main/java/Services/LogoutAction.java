package Services;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dbpack.DBCon;
public class LogoutAction extends Action{
	
	public LogoutAction() {
		
	}
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		String name=request.getSession().getAttribute("uname").toString();
		
		DBCon con=new DBCon();
		
		boolean a=con.updateFlag(name, 0);
		
		if(a) {
			
			return "Logout-Success";
			
		}else {
		
		return "Logout-Fail";
		
		}
		
	}
}