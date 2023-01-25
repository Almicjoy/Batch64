package design_pattern_singleton;

public class Employee {
	
	private static int x;
	
	private static Employee e;
	
	private Employee() {
		this.x = 4;
	}
	
	static int getValue() {
		return x;
	}
	
	public static Employee getInstance() {
		if(e == null) {
			e = new Employee();
		}
		
		return e;
		
	}
}
