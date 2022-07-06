package utilpack;

import java.util.Map;
import java.util.WeakHashMap;

public class ColDemo7 {
	public static void main(String[] args) {
		Map<String, String> map=new WeakHashMap<String, String>();
		
		String key1=new String("a1000");
		String key2=new String("a2000");
		
		map.put(key1, "Behind Force");
		map.put(key2, "Anound Tech");
		
		System.out.println(map);
		key1=null;
		System.out.println(map);
		System.gc();
		
		System.out.println(map);
	}

}
