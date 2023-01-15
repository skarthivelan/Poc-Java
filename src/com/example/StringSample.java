package com.example;

public class StringSample {
	
	
	public static void main(String[] args) {
		String random = "Hello World";
		System.out.println(random);
		
		String randomNew = new String("Java String");
		System.out.println(randomNew);
		
		String randomNew1 = randomNew.intern();
		System.out.println(randomNew1);
	}

}
