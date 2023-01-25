package com.java8.Lambda;

public class MyClass implements My1 {

	public static void main(String[] args) {
		My1 m1 = new MyClass();
		m1.test();
	}

	@Override
	public void test() {
		System.out.println("MyClass Test");
	}

}
