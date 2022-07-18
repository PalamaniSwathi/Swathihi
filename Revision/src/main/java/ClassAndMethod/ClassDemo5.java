package ClassAndMethod;

public class ClassDemo5 {
	public static void main(String[] args) {
		Demo2 obj=new Demo2();
		obj.met(0, 0, null, 0);
		obj.met2(23,"aaaaa","fdsaa",new String("fdafdsa"),199,234,324);
		obj.met3(new Object[] {23,"aaaa","fdsaa",new String("fdfdad"),199,234,342});
	}

}
class Demo2{
	void met(int i,int j,String s,int k) {
		
	}
	void met2(Object...obj) {
		System.out.println(obj.length);
		System.out.println(obj[2]);
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
	}
	void met3(Object... obj) {
		
	}
}
