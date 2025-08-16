package com.slotbooking.app.api;

public class LeedCodeExcercise {

	public static void main(String args[]) {

		LeedCodeExcercise obj = new LeedCodeExcercise();
		String result = obj.longestPalindrome("abb");
		System.out.println(result);
	}

	public String longestPalindrome(String s) {
		
		if(s.equals(new StringBuilder(s).reverse().toString())) {
			return s;
		}
		
		int temp = 0;
		String result = null;
		for(int i =0; i < s.length(); i++) {
			for(int j = 1+i; j<= s.length(); j++) {
				String con = s.substring(i, j);
				StringBuilder sb1 = new StringBuilder(con);
				int substringLength = con.length();
				if(con.equals(sb1.reverse().toString())) {
					if(temp < substringLength) {
						temp = substringLength;
						result = con;
					}
				}
			}
			
		}

		return result;

	}

}
