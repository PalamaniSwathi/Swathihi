package Services;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dbpack.DBCon;
import dtopack.UserDTO;
public class RegisterService extends Action {	
		
		private UserDTO user;
		
		private DBCon con;
		public UserDTO getUser() {
			return user;
		}
		public void setUser(UserDTO user) {
			this.user = user;
		}
		public DBCon getCon() {
			return con;
		}
		public void setCon(DBCon con) {
			this.con = con;
		}
		@Override
		public String execute(HttpServletRequest request, HttpServletResponse response) {
			
			user=new UserDTO();
			
			con=new DBCon();
			
			user.setUname(request.getParameter("uname"));
			
			user.setUpass(request.getParameter("upass"));
			
			boolean a=con.registerUser(user);
			
			if(a) {
					
					return "Logout-Success";
					
				}
				
			else {
			
			return "Logout-Fail";
			
			}
		
	}
}