package Ch6to10;

public class ThisDemo2 {
	 String s;
   public ThisDemo2(String s) {
	   this.s=s;
   }
	public static void main(String[] args) {
		// This keyword cannot be used inside a static method
		ThisDemo2 obj=new ThisDemo2("some value...");
		
		obj.met("856");

	}
public void met(String i) {
	System.out.println(i);
	System.out.println(this.s);
}
}

