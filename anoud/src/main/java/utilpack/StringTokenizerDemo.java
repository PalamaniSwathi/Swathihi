package utilpack;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		 StringTokenizer st = new StringTokenizer("my name is Swathi"," ");  
	     while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken());  
		}
	}

}
