package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamSample {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,3,4,9,8,5,6,7,8,9);
		
		//Given a list of integers, return only even numbers.
		List<Integer> list2 = list.stream().sorted().filter(n -> n% 2==0)
		.toList();
		System.out.println(list2);   
		
		//Sort descending
		List<Integer> list3 = list.stream().sorted(Comparator.reverseOrder())
				.toList();
		System.out.println(list3);
		
		//Sort ascending
		List<Integer> list4 = list.stream().sorted().toList();
		System.out.println(list4);
		
		//How to get the sum?
		int sum = list.stream()
				.filter(n-> n%2 == 0)
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println(sum);
		
		//String to Uppercase
		List<String> strList = List.of("The", "Lion","King");
		List<String> strList1 = strList.stream()
								.map(String::toUpperCase)
								.toList();
		System.out.println(strList1);
		
		//Print all elements of int array
		int[] arr = {1,2,3,2,4,1,2};
		Arrays.stream(arr).forEach(n -> {
			System.out.print(n);
		});
		System.out.println();
		Arrays.stream(arr).forEachOrdered(System.out::print);
		
		//Find duplicate elements in int array
		System.out.println();
		Set<Integer> dup = Arrays.stream(arr)
			.boxed()
			.collect(Collectors.groupingBy(
						n -> n,
						Collectors.counting()))
			.entrySet()
			.stream()
			.filter(e -> e.getValue()>1)
			.map(Map.Entry::getKey)
			.collect(Collectors.toSet());
		System.out.println(dup);
		System.out.println();
		
		//covert to map
		Map<Integer,Long> counting = Arrays.stream(arr)
				.boxed()
				.collect(Collectors.groupingBy(n-> n, Collectors.counting()));
		
		System.out.println(counting);
		System.out.println();
		
		//Find second highest number in array
		int secondHighest = Arrays.stream(arr)
					.distinct()
					.boxed()
					.sorted(Comparator.reverseOrder())
					.skip(1)
					.findFirst()
					.orElseThrow();
		System.out.println(secondHighest);
		System.out.println();
		
		//Sort String array by length
		String[] str = {"sort","string","array","by","length"};
		List<String> listStr = Arrays.stream(str)
					.sorted(Comparator.comparingInt(String::length))
					.toList();
		System.out.println(listStr);
		System.out.println();
		
		List<String> listStr1 = Arrays.stream(str)
				.sorted()
				.toList();
		System.out.println(listStr1);
		System.out.println();
		
		//Upper case
		List<String> upper = Arrays.stream(str)
									.map(s -> s.toUpperCase())
									.toList();
		System.out.println(upper);
		System.out.println();
		
		//first letter caps
		List<String> capitalFirst = Arrays.stream(str)
								.map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
								.toList();
		System.out.println(capitalFirst);
		System.out.println();
		
		//reverse each string
		List<String> reverseStr = Arrays.stream(str)
								.map(s -> new StringBuilder(s).reverse().toString())
								.toList();
		System.out.println(reverseStr);
		System.out.println();
		
		//count string length in Array
		List<Integer> strLenArray = Arrays.stream(str)
								.map(s-> s.length())
								.toList();
		System.out.println(strLenArray);
		System.out.println();
		
		//Sum string length in Array
		int strLenArray1 = Arrays.stream(str)
								.map(s-> s.length())
								.mapToInt(Integer::intValue)
								.sum();
		System.out.println(strLenArray1);
		System.out.println();
		
		//Filter string length >5 in Array
		List<String> reverseStr5 = Arrays.stream(str)
								.filter(s-> s.length() > 5)
								.toList();
		System.out.println(reverseStr5);
		System.out.println();
		
		//Print range of numbers
		IntStream.range(1, 10)
        .forEach(System.out::println);

	}

}
