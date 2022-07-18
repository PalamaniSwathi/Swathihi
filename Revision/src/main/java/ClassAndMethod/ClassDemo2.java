package ClassAndMethod;

public class ClassDemo2 {
public static void main(String[] args) {
	Test obj=new Test();
	obj.met();
	obj.met1();
	int result=obj.met3();
	System.out.println(result);
}
}
          
class Test{
	int i;
	void met() {
		int met=10;
		System.out.println(i);
		System.out.println(met);
	}
	void met1() {
		System.out.println(i);
	}
	int met3() {
		return 10;
	}
}

