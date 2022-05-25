package Ch6to10;

public class ConsDemo {
public ConsDemo() {
	System.out.println("cons with default called...");
}
public ConsDemo(int i) {
	System.out.println("cons with i value called...:"+i);
}
public ConsDemo(Employee e) {
	System.out.println("employee cons called..."+e);
}
	public static void main(String[] args) {
		new ConsDemo();
		new ConsDemo(20);
		new ConsDemo(new Employee());

	}

}
class Employee{}
