package JavaTest;

public class Scope {
	private int i;
	public static void main(String argv[]){
	Scope s = new Scope();
	s.amethod();
	}//End of main
	public static void amethod(){
	System.out.println("i");
	}//end of ametho
}//End of class
