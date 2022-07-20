package Services;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dbpack.DBCon;
import dtopack.UserDTO;
public class LoginAction extends Action{
	private UserDTO userDTO;
	private DBCon dbcon;
	public LoginAction() {
		
	}
	public DBCon getDbcon() {
		return dbcon;
	}
	public void setDbcon(DBCon dbcon) {
		this.dbcon = dbcon;
	}
	public UserDTO getUserDTO() {
		return userDTO;
	}
	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
	@Override
	public String execute(HttpServletRequest request,HttpServletResponse response) {
		userDTO=new UserDTO();
		dbcon=new DBCon();
		userDTO.setUname(request.getParameter("uname"));
		userDTO.setUpass(request.getParameter("upass"));
		
		boolean user=dbcon.checkUser(userDTO.getUname(), userDTO.getUpass());
		if(user) {
			boolean valid=dbcon.checkFlag(userDTO.getUname());
		    if(valid) {
			  dbcon.updateFlag(userDTO.getUname(), 1);
		      request.getSession().setAttribute("uname",userDTO.getUname());
			  return "login.welcome";
		    }
		    else {
		    	return "login.already-logedin";
		    }
		}
		else {
		return "login.invaliduser" ;
		}
	}
	
}