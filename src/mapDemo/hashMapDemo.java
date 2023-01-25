package mapDemo;

import java.util.HashMap;
import java.util.Map;

import collectionDemo.Employee;

public class hashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "1");
		m.put(2,  "Hello");
		m.put(49, "demo");
		m.put(null, null);
		System.out.println(m);
		
		Employee e = new Employee(101, "ABC", 101f);
		Employee e2 = new Employee(101, "ABC", 101f);
		
		
		Map map = new HashMap();
		map.put(e, 1);
		map.put(e2,  2);
		System.out.println(map);
	}

}

/* HashMap:
 * -> is not order preserved
 * -> takes duplicate values but not duplicate key
 */
