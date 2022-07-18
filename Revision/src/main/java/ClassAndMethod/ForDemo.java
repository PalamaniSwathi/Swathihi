package ClassAndMethod;

public class ForDemo {
	public static void main(String[] args) {
		int i[]= {10,20,30,40,131};

		System.out.println("The size of array is...:"+i.length);
		for(int n=0;n<i.length;n++) {
			int value=i[n];
			System.out.println(value);
			System.out.println(i[0]);
		}
		for(int value:i) {
			System.out.println(value);
		}
	}

}
