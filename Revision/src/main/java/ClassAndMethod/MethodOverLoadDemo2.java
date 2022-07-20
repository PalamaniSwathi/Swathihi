package ClassAndMethod;

import java.util.Scanner;

public class MethodOverLoadDemo2 {
	public static void main(String[] args)throws Exception {
		GoodHall ghall=new GoodHall();
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the party class name...:");
		String className=scan.next();
		Party party=(Party)Class.forName(className).newInstance();
		ghall.party((Birthday)party);
		
	}

}
class Hall{
	public void party(String purpose) {
		if(purpose.equals("birthday")) {
			System.out.println("Brithday party arrangements made...");
		}
		else if(purpose.equals("marriage")) {
			System.out.println("mariage party arrangements made...");
		}
		
	}
	
}
class GoodHall{
	public void party(Birthday party) {
		System.out.println("Birthday party arrangements made...");
		party.execute();
	}
	public void party(Marriage party) {
		System.out.println("Marriage party arrangements made..");
		party.execute();
	}
	
}
abstract class Party{
	public abstract void execute();
	
}
class Birthday extends Party{
	@Override
	public void execute() {
		System.out.println("Happy birthday to you....");
		
	}
	
}
class Marriage extends Party{
	@Override
	public void execute() {
		System.out.println("Happy married life");
		
	}
}
