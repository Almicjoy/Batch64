package collectionDemo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map m = new TreeMap();
		m.put("hello", 1);
		m.put("welcome", 2);
		m.put("abc", "www");
		System.out.println(m);
	}

}

//TreeMap is for sorting by the key
//can only take one datatype in the key
