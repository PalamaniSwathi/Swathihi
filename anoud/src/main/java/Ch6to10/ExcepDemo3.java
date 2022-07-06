package Ch6to10;

public class ExcepDemo3 {

	public static void main(String[] args) {
		System.out.println("before exception...");
		try {
			String s=args[0];
			Integer.parseInt(s);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		}finally {
			System.out.println("finally black code called...");
		}
		System.out.println("after exception");

	}

}
