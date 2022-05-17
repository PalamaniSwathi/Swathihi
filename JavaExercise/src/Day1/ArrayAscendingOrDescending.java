package Day1;
import java.util.Scanner;
public class ArrayAscendingOrDescending {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int[]a=new int[5];
		int i,j,temp;
		System.out.println("Please Enter An Array");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			for(j=i+1;j<5;j++)
			{
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Ascending oder:");
		for(j=0;j<5;j++)
			{
			System.out.println(a[j]);
			}
		for(i=0;i<5;i++)
		{
			for(j=i+1;j<5;j++)
			{
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
		
				}
			}
		}
		System.out.println("Decending order:");
		for(j=0;j<5;j++) {
			System.out.println(a[j]);
		}

	}

}
