package com.stream;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Employee e = new Employee(101, "Alessa", "NY");
		
		Optional<String> eName = Optional.ofNullable(e.getName());
		System.out.println(eName.map(String::toUpperCase).orElse("Default value"));
		System.out.println(eName.map(String::toUpperCase).orElseGet(() -> "Default value"));
//		System.out.println(eName.orElseThrow(() -> new IllegalArgumentException("name not found")));
		eName.ifPresent(g -> System.out.println("Value available"));
	}

}
