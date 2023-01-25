package collectionDemo;

import java.util.LinkedList;
import java.util.List;

public class Second {

	public static void main(String[] args) {
		List l = new LinkedList();
		l.add(1);
		l.add(100);
		System.out.println(l);
		System.out.println(l.indexOf(100));
	}

}

/* Rule for sorting collections:
 * 1. Elements should be of the same type - ClassCastException
 * 2. Null is not allowed - NullPointerException
 * 3. must be Comparable or Comparator type
 */


