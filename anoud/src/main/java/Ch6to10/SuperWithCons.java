package Ch6to10;

public class SuperWithCons {
public static void main(String[] args) {
	ConsBot cb=new ConsBot("aaaaa");
}
}
abstract class ConsTop{
	public ConsTop(){
		System.out.println("top cons object created....");
	}
}
abstract class ConsMed extends ConsTop{
	public ConsMed(int i) {
		System.out.println("med cons object created..."+i);
	}
}
class ConsBot extends ConsMed{
	public ConsBot(String s) {
		super(100);//super call to constructor should be the first line
		System.out.println("bottom cons object created....");
		
	}
}
