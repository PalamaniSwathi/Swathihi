import java.net.URL;
import java.net.URLConnection;

public class CallServlet {
	public static void main(String[] args) throws Exception{
	URL url=new URL("http://localhost:8080/behindforce/Ram");
	URLConnection con=url.openConnection();
	con.getInputStream();
	}
	
	}