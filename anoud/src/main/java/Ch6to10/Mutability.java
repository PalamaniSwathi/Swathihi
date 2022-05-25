package Ch6to10;

public class Mutability {

	public static void main(String[] args) {
		// simple types-pass by value
		int n=100;
		int k=n;
		n=n+100;
		System.out.println(n);
		System.out.println(k);
		String str="hello";
		String temp=str;
		str=str+"world......";
		System.out.println(str);
		System.out.println(temp);
		//complex type-pass by reference
		World w=new World();
		World tempw=w;
		w.size=110000;
		System.out.println(w.size);
		System.out.println(tempw.size);

	}

}
class World{
	int size=10;
	
}