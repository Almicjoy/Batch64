package collectionsPractice;

import java.util.Collections;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		BusinessLogic bLogic = new BusinessLogic();
		bLogic.process(234, "John", 45, "Marketing", 3000.00);
		bLogic.process(123, "Alessa", 21, "Information Technology", 5000.00);
		bLogic.process(345, "Sam", 18, "Human Resources", 4000.00);
		bLogic.process(234, "Ralph", 45, "Marketing", 3000.00);
		bLogic.process(879, "Anne", 20, "Accounts", 2000.00);
		
//		Collections.sort(bLogic.employees, new AgeComparator());
//		System.out.println(bLogic.employees);
		
		List<Employee> sortedByAge = bLogic.employees.stream()
				.sorted((emp1, emp2) -> emp1.getAge().compareTo(emp2.getAge())).toList();
		System.out.println(sortedByAge);
		
		
	}

}
