package ClassAndMethod;

public class StaticBlock {
	static {
		System.out.println("static block called...");
	}
	public static void main(String[] args) {
		new SBDemo();
	}

}
class SBDemo{
	static {
		System.out.println("SBDemo static block called......");
	}
	public SBDemo() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor called....");
	}
	static void met() {
		System.out.println("static method met called..");
	}
	static void met1() {
		System.out.println("static method met2 called...");
	}
}
