package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class First {

	public static void main(String[] args) {
		List<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(103, "Tsuki", 500.45f));
		l.add(new Employee(101, "Alessa", 500.45f));
		l.add(new Employee(102, "Alvaro", 500.45f));
		
		Collections.sort(l, new NameComparator());
		
		System.out.println(l);	
	}

}
