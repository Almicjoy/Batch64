package com.more.examples;

import java.util.function.BiFunction;
import java.util.function.Function;

public class functionDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> t = (x) -> x * x;
		Integer result = t.apply(5);
		
		BiFunction<Integer, Integer, Integer> f = (a, b) -> a * b;
		Integer result2 = f.apply(3, 4);
		System.out.println(result + " " + result2);
	}

}
