package utilpack;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ColDemo6 {
	public static void main(String[] args) {
		Properties prop=new Properties();
		
		prop.put("a100", "java");
		prop.put("a200", "oracle");
		prop.put("a300", "borland");
		
		System.out.println(prop);
		
		System.out.println(prop.get("a200"));
		
		Set s=prop.entrySet();
		Iterator iter=s.iterator();
		
		while(iter.hasNext()) {
			Map.Entry me=(Map.Entry)iter.next();
			
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}

}
