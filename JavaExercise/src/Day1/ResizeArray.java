package Day1;
import java.util.ArrayList;
import java.util.List;
public class ResizeArray {

	public static void main(String[] args) {
		int arr[]=new int[] {12,34,21,33,22,55};
		for(int a:arr) {
			System.out.println("The array values are:"+a);
			
		}
		List<Integer>List=new ArrayList<>();
		for(int a:arr) {
			List.add(a);
		}
		System.out.println("\n" +List);
		List.add(100);
		System.out.println(List);

	}

}
