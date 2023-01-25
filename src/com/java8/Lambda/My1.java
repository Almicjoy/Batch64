package com.java8.Lambda;

@FunctionalInterface
public interface My1 {
	
	void test();
	
	//introduced in Java 8
	default void test1() {
		
	}

}
