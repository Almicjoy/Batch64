package collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CursorDemo {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		
		List l2 = Arrays.asList(10, 20);
		System.out.println(l);
		System.out.println(l2);
		
		System.out.println("Enhanced for loop:");		
		for(Integer i: l) {
			System.out.println(i);
		}
		
		System.out.println("\nIterator:");
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
