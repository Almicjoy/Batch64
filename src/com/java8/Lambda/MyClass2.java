package com.java8.Lambda;

public class MyClass2 implements My3{

	public static void main(String[] args) {
		My3 m3 = new MyClass2();
	}

	@Override
	public int test(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void test1() {
		System.out.println("hey");
	}
	
//	public static void test2() {
//		System.out.println("hey2");
//	}

}
