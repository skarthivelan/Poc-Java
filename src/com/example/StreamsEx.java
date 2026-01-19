package com.example;

import java.util.List;
import java.util.OptionalInt;

public class StreamsEx {
	
	//https://medium.com/@bhangalekunal2631996/100-java-streams-interview-questions-with-solutions-and-outputs-2afb0713ceec

	public static void main(String[] args) {
		//Find the Sum of All Elements in a List
		List<Integer> list = List.of(1,2,3,5,4,5,4);
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of All Elements - "+sum +"\n");
		
		//Find the Product of All Elements in a List
		int product = list.stream().reduce(1,(a, b) -> a*b);
		System.out.println("Product of All Elements - "+product +"\n");
		
		//Find the Average of All Elements in a List
		double average = list.stream().mapToInt(Integer::intValue).average().orElse(0);
		System.out.println("Average of All Elements - "+average +"\n");
		
		//Find the Maximum Element in a List
		int max = list.stream().max(Integer::compare).orElse(0);
		System.out.println("Maximum Element in a List - "+max +"\n");
		
		//Find the Minimum Element in a List
		int min = list.stream().min(Integer::compare).orElse(0);
		System.out.println("Minimum Element in a List - "+min +"\n");

	}
	
	
	
}
