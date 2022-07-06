package Ch6to10;

public class InterfaceDemo {
	
}

interface MyInter{
	
}

interface MyInter2{
	public void met();
}

interface MyInter3{
	static final float pi=3.14f;
	public void met();
	public abstract void met2();
	default void met3() {
		
	}
	private void met4() {
		
	}
	static void met5() {
		
	}
}

interface MyInter4 extends MyInter3{
	
}