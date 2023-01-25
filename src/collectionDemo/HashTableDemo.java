package collectionDemo;

import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Map m = new Hashtable();
		m.put(1,  1);
		m.put(2, 1);
		System.out.println(m);
		
		Map lm = new LinkedHashMap();
		lm.put(2,  null);
		lm.put(null, 1);
		System.out.println(lm);
		
		Map ihm = new IdentityHashMap();
		ihm.put(2, "hello");
		ihm.put(2, 1);
		System.out.println(ihm);
	}

}

/* -> Hashtable is a legacy class which was added in jdk version 1.1 onwards
 * -> cannot have a key or value with null value; will give NullPointerException
 * -> it is thread safe
 * -> order is not preserved
 * 
 * -> LinkedHashMap order is preserved
 * -> can have null as key and value
 * -> is not thread safe
 * 
 * -> IdentityHashMap does not preserve order
 * -> can have null as key and value
 * -> uses reference-equality instead of object-equality
 * -> not thread safe
 */
