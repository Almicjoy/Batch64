package collectionsPractice;

import java.util.ArrayList;
import java.util.List;

public class BusinessLogic {
	List<Employee> employees = new ArrayList<Employee>();
	
	public void process(int id, String name, int age, String dept, double salary) {
		Employee e = new Employee(id, name, age, dept, salary);
		employees.add(e);
	}

}
