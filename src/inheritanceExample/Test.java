package inheritanceExample;

public class Test {
	public static void main(String[] args) {
//		A a = new A();
		B b = new B();
		C c = new C();
		
		b.setAid(101);
		b.setAname("Alessa");
		b.setBid(102);
		b.setBname("Alvaro");
		
		c.setAid(104);
		c.setAname("Tsuki");
		c.setCid(103);
		c.setCname("Nadia");
		
		System.out.println(c.getAid() + ", " + c.getAname());
		System.out.println(b.getBid() + ", " + b.getBname());
		System.out.println(c.getCid() + ", " + c.getCname());
		System.out.println(b.getAid() + ", " + b.getAname());

	}
	
	/*Inheritance - child class inherits properties from parent class
	 * - it means that we can access parent class properties from a child class object
	 * - keywords: extends, implements
	 * - types: 
	 * 	1. single: one parent has one child
	 * 	2. multilevel: parent has child and that child is a parent of another child
	 *  3. multiple: many parents to one child
	 *  4. hierarchical: one parent has many children
	 *  
	 *  java does not support multiple inheritance with classes
	 *  it only supports multiple inheritance with interfaces
	 */
	
	/*Encapsulation
	 * protecting attributes by making them private and have public methods to access them by
	 * 
	 */
	
	//static - does not depend on object; can access it with class name
	//will initialize at the time of class loading
	//non-static variables initialize when we create objects of the class
	/* 1. Static block - a block that executes before the main method
	 * 2. Static method - 
	 * 3. Static variable - 
	 * 
	 */
	
	
}
