package polymorphism;

public class Test {

	public static void main(String[] args) {
		Overriding1 o1 = new Overriding1();//inheritance
		
		Overriding o2 = new Overriding1();//overriding
		
		o1.test();
		o1.test1();
		o2.test();
		o2.test1();

	}
	
	//in overriding, parent class reference holds child class object
	//the reverse is not possible
	
	//Rules of Overriding:
	/* 1. method signature should be the same
	 * 2. can increase accessibility of method from parent to child but cannot decrease accessibility
	 * */

}
