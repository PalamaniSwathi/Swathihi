package Ch6to10;

public class StringDemo {
	public static void main(String[] args) {
		String str=new String("hello");	
		String str2="hello";
		
		System.out.println(str==str2);
		
		System.out.println(str.equals(str2));
		
		if(str.equals(str2)) {
			System.out.println("both are equal...");
		}
		
		String v=String.format("My name is is ..:%s","Billa");
		
		System.out.println(v);
		
		v=String.format("My name is is ..:%s and my age is..:%d","Billa",70);
		
		System.out.println(v);
		
		v=String.format("My name is is ..:%s and my age is..:%d and my weight is..:%f","Billa",70,60.5f);
		
		System.out.println(v);
		
		System.out.printf("My name is is ..:%s and my age is..:%d and my weight is..:%f","Billa",70,60.5f);
        System.out.printf("\n%-20s%-20s%-20s", "Column1","Column2","Column3");
        System.out.printf("\n%-20s%-20s%-20s","sNo","Name","Company");
        System.out.printf("\n%-20s%-20s%-20s","100","Swathi","Anound Technologies");
        System.out.println();
        System.out.printf("%.3f",100.23434343f);
        
        
	}
}
