package collectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class MyString {

	public static void main(String[] args) throws InterruptedException{
		Map<Test, String> m = new WeakHashMap<Test, String>();
		Test t = new Test();
		
		m.put(t, "Hello");
		
		System.out.println(m);
		
		t = new Test();
		
		System.gc();
		System.out.println(m);
	}

}

/* -> garbage collection dominates over WeakHashMap
 * -> HashMap dominates over garbage collection
 */
