package com.java8.Lambda;

public class MyClassLambda {

	public static void main(String[] args) {
		My1 m = () -> System.out.println("MyClass Test");
		m.test();
		
		My1 m1 = () -> {
			System.out.println("Line 1");
			System.out.println("Line 2");
			System.out.println("Line 3");
		};
		m1.test();
		
		My2 m2 = (x) -> {
			System.out.println("Line 1");
			System.out.println("Line 2");
			System.out.println("Line 3");
		};
		m2.test(10);
		
		My3 m3 = (x, y) -> x * y;
		System.out.println(m3.test(10, 20));
	}

}
