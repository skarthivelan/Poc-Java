package com.example;

public class StringSample {
	
	
	public static void main(String[] args) {
		String random = "Hello World";
		System.out.println(random);
		
		String randomNew = new String("Java String");
		System.out.println(randomNew);
		
		String randomNew1 = randomNew.intern();
		System.out.println(randomNew1);
		
		String splitStr = randomNew.substring(5, randomNew.length());
		System.out.println(splitStr);
		
		char[] strArray = randomNew.toCharArray();
		System.out.println(strArray[0]);
	}

}
