package Ch6to10;

public class StringDemo2 {

	public static void main(String[] args) {
		 String s="Hello World";
		 String s1="Hi";
		 System.out.println(s1.contains("hi"));
		 System.out.println(s1.contains("Hi"));
		 System.out.println(s.charAt(1));
		 System.out.println(s.indexOf('e'));
		 System.out.println(s.toUpperCase());
		 System.out.println(s.compareTo(s1));
		 System.out.println("string length is:"+s.length());
		 String str=s.toLowerCase();
		 s1=s1.concat("Every one");
		 System.out.println(s.endsWith("d"));
		 System.out.println(s.endsWith("world"));
		 System.out.println(s.endsWith("World"));
		 System.out.println(s1);
		 System.out.println(str);
		 char c[]=s.toCharArray();
		 for(char cc:c) {
			 System.out.print(cc+"\t");
		 }
		 str=s.substring(6);
		 System.out.println();
		 System.out.println(str);
		 str=s.substring(2,8);
		 System.out.println(str);
		 str=str.concat("MyWorld");
		 System.out.println(str);
		 System.out.println(str.length());

	}

}
