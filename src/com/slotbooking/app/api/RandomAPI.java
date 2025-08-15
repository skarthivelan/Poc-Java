package com.slotbooking.app.api;

public class RandomAPI {
	
	public static void main(String args[]) {
		System.out.println("Hi");
		
		System.out.println(  reverseAString("how are you"));
		System.out.println(wordsCount("Kia ora how are you"));
	}
	
	private String wordSaparator(String word) {
		//I got a statement without an space, now i want to use any library to split the word exactly. 
		
		return "";
	}
	
	private static String reverseAString(String word) {
		
		StringBuilder sb = new StringBuilder(word).reverse();
		
		return sb.toString();
	}

	
	private static int wordsCount(String word) {
		int result = 0;
		
		String a[] = word.split(" ");
		result = a.length;
		
		return result;
	}
	
}
