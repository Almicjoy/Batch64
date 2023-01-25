package com.java8.testerStream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class TesterStream {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		System.out.println("List: " + strings);
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 7, 3, 5);
		System.out.println("List: " + numbers);
		
		List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);
		System.out.println("List: " + integers);
		
		long count = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Empty Strings: " + count);
		
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).toList();
		System.out.println("Filtered List: " + filtered);
		
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged Strings: " + mergedString);
		
		List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().toList();
		System.out.println("Squares List " + squaresList);
		System.out.println("List: " + numbers);
		
		IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("List: " + integers);
		System.out.println("Highest number in List: " + stats.getMax());
		System.out.println("Lowest number in List: " + stats.getMin());
		System.out.println("Sum of all numbers: " + stats.getSum());
		System.out.println("Average of all numbers: " + stats.getAverage());
		System.out.println("Random numbers: ");
		
		
		
		
	}
	
}
