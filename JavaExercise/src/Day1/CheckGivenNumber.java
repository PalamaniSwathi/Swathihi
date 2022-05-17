package Day1;
import java.util.Scanner;
public class CheckGivenNumber {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a number maximum 9 digit");
	int num=input.nextInt();
	
	System.out.println("enter your choice:");
	int a=input.nextInt();
	switch(a)
	{
	case 1:
		int n=num;
		int res=0,remainder;
		while(num>0) {
			remainder=num%10;
			res=res+(remainder*remainder*remainder);
			num=num/10;                        
		}
		if(res==n)
			System.out.println(n+"is an Armstrong Number");
		else
			System.out.println(n+"is not a Armstrong Number");
		break;
	case 2:
		int k=num;
		int reverse=0,rem;
		while(num>0)
		{
			rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
			
		
		}
		if(reverse==k)
			System.out.println(k+"Palindrome Number");
		else
			System.out.println(k+"is not a Palindrome Number");
		break;
	case 3:
		int perfectNo=0;
		int i;
		System.out.println("Factors are:");
		for(i=1;i<num;i++)
		{
			if(num%i==0)
			{
				perfectNo +=i;
				System.out.println(i);
			}
		}
		if(perfectNo==num)
		{
			System.out.println("number is perfect number");
			
		}
		else
		{
			System.out.println("number is not a perfect number");
		}
		default:
			System.out.println("none of these");
	}

	}

}
