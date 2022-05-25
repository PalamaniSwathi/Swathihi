package Ch6to10;

public class StaticBlockDemo {

		static {
			System.out.println("static block called...");
		}
		public static void main(String[] args) {
			//new SBDemo();
			SBDemo.met();
			//SbDemo.met2();
	}

}
class SBDemo{
	static {
		System.out.println("SBDemo static block called....");
	}
	SBDemo(){//constructor
		System.out.println("Constructor called...");
}
	static void met() {
		System.out.println("Static method met called...");
	}
	static void met2() {
		System.out.println("static method met2 called...");
	}

}
