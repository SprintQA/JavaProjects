package com.sprintqa.java.reviewclass13Feb;

public class WrapperClassExample {
	public static void main(String[] args) {
		
		// Convert string value to boolean
		String str1 = "yes";
		boolean b = Boolean.parseBoolean(str1);
		
		
		// convert string value to integer
		String  i = "120";
		int j = Integer.parseInt(i);
		
		
		
		// convert int value to string 
		int k = 12345;
		String k1 = String.valueOf(k);
		
		System.out.println(k1);
		
		
	}
}
