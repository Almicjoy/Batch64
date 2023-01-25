package com.java8.testerStream;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Allen", "Savings", 12345),
				new Employee("Ben", "Checking", 222),
				new Employee("Mark", "Savings", 111),
				new Employee("Mike", "Checking", 22222)
		);
		List<Integer> salaries = employees.stream().map(e -> e.getSalary()).toList();
		System.out.println(salaries);
		
		List<String> names = employees.stream().filter(e -> e.getSalary() > 1234).map(n -> n.getName()).toList();
		System.out.println(names);
		
		List<Employee> allen = employees.stream().filter(e -> e.getName() == "Allen").toList();
		System.out.println(allen);
		
		Employee e1 = employees.stream().filter(e -> e.getName().equals("Allen")).findFirst().orElse(null);
		System.out.println(e1);
	}

}
