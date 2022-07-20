package ClassAndMethod;

public class PassByValueDemo {
	public static void main(String[] args) {
		PassByValueDemo obj=new PassByValueDemo();
		obj.met(20);
		met3();
	}
	public void met(int i) {
		i=i+10;
		System.out.println(i);
		met2("hello",i);
	}
	public void met2(String s,int i) {
		System.out.println(s+":"+i);
	}
	public  static void met3() {
		
	}

}
