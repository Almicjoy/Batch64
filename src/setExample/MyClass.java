package setExample;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import collectionDemo.Employee;
import collectionDemo.NameComparator;

public class MyClass {

	public static void main(String[] args) {
		Set s = new TreeSet(new NameComparator());
		s.add(new Employee(103, "Tsuki", 500.45f));
		s.add(new Employee(101, "Alessa", 500.45f));
		s.add(new Employee(102, "Alvaro", 500.45f));
		System.out.println(s);
		
		Set s1 = new HashSet();
		s1.add(new Employee(101, "ABC", 30f));
		s1.add(new Employee(101, "ABC", 30f));
		System.out.println(s1);
		
		
	}

}


/* Internal Structure of Set:
 * -> set has HashTable underlying data structure
 * -> HashTable stores data in key value pairs
 * -> HashTable has DoublyLinkedList underlying data structure
 * -> set is not order preserved
 * -> TreeSet is used for sorting purposes: can only have one data type
 * -> LinkedHashSet order is preserved
 */

/* How to calculate index of set element:
 * index = hashCode % total size
 * when set is converting into HashTable, value of set will become the
 *  key of the HashTable and value will be constant
 */

/* Hashing - unique value on behalf of hashCode() and equals() methods
 */

