package com.stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<Employee> elist = Arrays.asList(
				new Employee(101, "Allen", "NY"),
				new Employee(101, "James", "UK"));
		
		Employee emp = elist.stream().filter(e -> e.getAddress().equals("UK")).findFirst().orElse(null);
		System.out.println(emp);
	}

}
