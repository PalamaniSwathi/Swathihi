package lab1;

public class SwapTwoNumbers {
	public static void main(String[]args) {
	float first= 2.50f, second = 4.50f;
	
	System.out.println("--Before swap");
	System.out.println("First number=" +first);
	System.out.println("Second number=" +second);
	
	//value of first is assigned to temporary
	float temporary=first;
	
	//value of second is assigned to first
	first=second;
	
	//value of temporary(which contains the initial value of first) is assigned to second 
	second=temporary;
	
	System.out.println("--After swap--");
	System.out.println("First number =" +first);
	System.out.println("Second number=" +second);
	}
}
	
	


