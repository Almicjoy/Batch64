package polymorphism;

public class Overloading {

	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.test();
		o.test(10);

	}
	
	void test() {
		System.out.println("first test");
	}
	
	void test(int x) {
		System.out.println("second test");
	}
	
	//Example of compile time polymorphism - method overloading
	//overloading occurs in a single class
	//can perform it based on:
	/* 1. number of parameters
	 * 2. type of parameters
	 * 3. order of parameters
	 * */

}
