package utilpack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class ColDemo2 {
public static void main(String[] args) {
	Set<String> hs=new HashSet<String>();
	
	hs.add("aa");
	hs.add("ba");
	hs.add("ca");
	
	System.out.println(hs);
	hs.remove("aa");
	System.out.println(hs.size());
	System.out.println(hs);
	System.out.println(hs.isEmpty());
	System.out.println(hs.contains("ba"));
	
	//hs.forEach(new MyConsumer());
	//hs.forEach((s)->{System.out.println(s);});
	hs.forEach(ColDemo2::print);
	Iterator<String> it=hs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
 static void print(String s) {
	 System.out.println(s);
	
}
}
class MyConsumer implements Consumer<String>{
	@Override
	public void accept(String s) {
		System.out.println(s);
		
	}
	
}
