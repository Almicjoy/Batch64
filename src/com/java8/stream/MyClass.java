package com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyClass {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> even = even(list);
		List<Integer> evenStream = list.stream().filter(i -> i%2==0).toList();
		System.out.println(even);
		System.out.println(evenStream);
		
		Stream<Integer> stream1 = list.stream();
		Stream<Integer> stream2 = list.stream();//Converting list into stream
		List<Integer> item = stream1.filter(i -> i%2==0).toList(); //filter and convert back to list
		System.out.println("Test:" + item);
		
		Predicate<Integer> p = i -> i>9;
		
		Stream<Integer> pre = stream2.filter(p);
		pre.forEach(i -> System.out.println(i));
	}
	
	static List<Integer> even(List<Integer> list) {
		
		List<Integer> l = new ArrayList<Integer>();
		for(Integer i: list) {
			if(i%2 == 0) {
				l.add(i);
			}
		}
		
		return l;
	}
}

