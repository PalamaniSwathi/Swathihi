package action;
import java.io.PrintWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
public class NumberChecking extends TagSupport{
	
	@Override
	public int doEndTag() throws JspException {
		int n=Integer.parseInt(number);
		JspWriter out=pageContext.getOut();
		if(n%2==0) {
			try {
				out.println("<h1>Even Number........................");
			}catch(Exception e) {}
		}
		else {
			try {
				out.println("<h1>Odd Number.........................");
			}catch(Exception e) {}
		}
		return super.doEndTag();
	}
	
	String number;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}