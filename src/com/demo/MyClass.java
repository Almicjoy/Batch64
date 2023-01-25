package com.demo;

public class MyClass {

	public static void main(String[] args) {
		int x = 10;
		int w = x++;

		System.out.println(x+ ","+ w);
		System.out.println("Hello World! " + x);
		
		//Syntax for creating an object in Java
		//<class name> <reference name> = new <class name> ();
		MyClass myClass = new MyClass();
//		MyClass myClass1 = new MyClass();
//		myClass.test(2);
//		myClass1.test(3);
		
		int y = myClass.test1(101);
		int z = myClass.test1(100);
		
		System.out.println(y + " , " + z);
		
		System.out.println("End.");
	}
	
//	void test(int x) {
//		System.out.println("Hello from Test " + x);
//	}
//	
	int test1(int x) {
		System.out.println("Hello from test " + x);
		return ++x;
	}

}


//JDK (Java Development Kit) - does compilation and execution
//JRE (Java Runtime Environment) - does only execution
//JVM (Java Virtual Machine) -  environment where java executes; is in JDK and JVM
//compilation starts from first line to last line
//execution starts from the main method and closes with the main method

//Difference between object and reference
/*Heap Memory - for initialization of global and instance variables
 *Stack memory - for initialization of local variables
 * 
 * */


//pre - increments and then returns
//post - returns and then incrementss
