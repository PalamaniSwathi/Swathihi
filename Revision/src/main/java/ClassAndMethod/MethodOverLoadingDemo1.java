package ClassAndMethod;

public class MethodOverLoadingDemo1 {
	public static void main(String[] args) {
		MethodOverLoadingDemo1 obj=new MethodOverLoadingDemo1();
		obj.met(23.3f);
		
	}


public void met(int i,int j) {
	System.out.println("int param met method called..");
	
}
int met() {
	System.out.println("no param met method called...");
	return 1;
}
void met(float f) {
	System.out.println("float param method called...");
}
}
