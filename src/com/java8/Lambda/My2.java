package com.java8.Lambda;

@FunctionalInterface
public interface My2 {
	
	void test(int x);
	
	//introduced in Java 8
	default void test1() {
		
	}

}
