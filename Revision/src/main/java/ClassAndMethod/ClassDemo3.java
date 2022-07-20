package ClassAndMethod;

public class ClassDemo3 {
public static void main(String[] args) {
	Bank bk=new Bank();
	boolean b=bk.depositcash(4000);
	long l=bk.getmoney();
	String s=bk.getName();
	System.out.println(b);
	System.out.println(l);
	System.out.println(s);
}
}
class Bank{
	boolean depositcash(int amt) {
		if(amt>1000) {
			return true;
		}
		else {
			return false;
		}
	}
	long getmoney() {
		return 10L;
	}
	String getName() {
		return "ram";
	}
}
