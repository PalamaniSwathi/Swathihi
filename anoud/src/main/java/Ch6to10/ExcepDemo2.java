package Ch6to10;

public class ExcepDemo2 {
	public static void main(String[] args) {
		if(args.length==0) {
		System.out.println("please give a arguent value....");
	}
	else {
		String v=args[0];
		char c=v.charAt(0);
		if(Character.isDigit(c)){ 
			int n=Integer.parseInt(c+"");
			if(n==0) {
				System.out.println("Please enter a non zero value...");
			}
			else {
				System.out.println(n);
				int x=1/n;
			}
		}
		else {
			System.out.println("please enter number as argument...");
		}
	}

}
	}

