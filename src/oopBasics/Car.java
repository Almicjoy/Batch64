package oopBasics;

public class Car extends Vehicle{
	
	
	
	public Car() {
		super();
		System.out.println("Car");
	}
	
//	public static void test() {
//		System.out.println("I am a static method");
//	}
	
	static {
		System.out.println("I am a static block");
	}

}
