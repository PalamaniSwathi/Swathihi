package Ch6to10;

public class StringDemo {
	public static void main(String[] args) {
		String str=new String("hello");	//this will create two objects	
		String str2="hello";//this will create one object
		
		System.out.println(str==str2);//this will compare the objects not the value
		
		System.out.println(str.equals(str2));//equals method compares the values...
		
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
	}
}
