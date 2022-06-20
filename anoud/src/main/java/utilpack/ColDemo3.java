package utilpack;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class ColDemo3 {
	public static void main(String[] args) {
		Set<A> s=new TreeSet<>(new MyComparator());
		s.add(new A("Ramu"));
		s.add(new A("Sita"));
		s.add(new A("Raju"));
		s.add(new A("Rani"));
		System.out.println(s);
		
		
	}

}
class A implements Comparable<A>{
	String name;
	public A(String name) {
		this.name=name;
	}
	@Override
	
	public int compareTo(A s) {
		
		return name.compareTo(s.name);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
class MyComparator implements Comparator<A>{
	@Override
	public int compare(A obj1, A obj2) {
		return obj2.compareTo(obj1);
	}
}

