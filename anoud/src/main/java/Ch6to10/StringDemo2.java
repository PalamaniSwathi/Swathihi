package Ch6to10;

public class StringDemo2 {

	public static void main(String[] args) {
		 String s="Hello World";
		 System.out.println(s.charAt(1));
		 System.out.println(s.indexOf('e'));
		 System.out.println(s.toUpperCase());
		 String str=s.toLowerCase();
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
