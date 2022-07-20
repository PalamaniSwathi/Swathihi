package ClassAndMethod;

public class Mutability {
	public static void main(String[] args) {
		int n=100;
	    int k=n;
	    n=n+100;
	    //pass by value-duplicate values passed
	    System.out.println(k);
	    System.out.println(n);
	    String str="hello";
	    String temp=str;
	    str=str+"world";
	    System.out.println(str);
	    System.out.println(temp);
	   //pass by reference- original value passed 
	    World w=new World();
	    World temp1=w;
	    w.size=110000;
	    
	    System.out.println(w.size);
	    System.out.println(temp1.size);
	    
	}

}
class World{
	int size=10;
}
