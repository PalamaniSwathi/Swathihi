package InterJava;

public class ThreadDemo2 {
public static void main(String[] args) {
	Thread t=Thread.currentThread();
	System.out.println(t);
	t.setPriority(9);
	t.setName("mythread...");
	System.out.println(t);
	for(int i=0;i<5;i++) {
		System.out.println(i);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		}
}
}
}