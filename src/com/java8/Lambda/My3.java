package com.java8.Lambda;

public interface My3 {
	
	int test(int x, int y);
	
	//introduced in Java 8
	default void test1() {
		System.out.println("default method");
	}
	
	static void test2() {
		System.out.println("static method");
	}
	
}
