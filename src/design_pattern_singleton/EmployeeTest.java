package design_pattern_singleton;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e = Employee.getInstance();
		Employee e2 = Employee.getInstance();
		Employee e3 = Employee.getInstance();
		Employee e4 = Employee.getInstance();
		System.out.println(e.hashCode());
		System.out.println(e.getValue());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		

	}

}

/* Singleton -- we can create only one object of a single class
 * 
 * Rules of singleton class
 * 1. constructor must be private
 * 2. create a static method with the return type of its own class
 * 3. check if object is null, then create object
 * 		else return the same object
 */
