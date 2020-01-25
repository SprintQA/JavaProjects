package com.sprintqa.java.class13;

public class StringManipulation {

	public static void main(String[] args) {
		// Primitive / Non Primitive

		String str1 = "Hello"; // Declaring a String variable and assigning value
		String str3 = "Hello";
		String str2 = new String("Hello"); // Declaring a String object and assigning value via object creation
		String str4 = new String("Hello");

		String actualWebTitle = "stock exchange site";
		String expectedTitle = "This is a stock exchange site";

		String strWithUpperCase = "WELCOME TO eBaY";
		String strWithLowerCase = "Ebay";

//		int i = 12367;

//		System.out.println(str1==str3); // true because compiler will refer to same object / location in memory
//		System.out.println(str2==str4); // false - compiler will refer to different location in memory

//		System.out.println(expectedTitle.equals(actualWebTitle)); // it checks for the equality
//		System.out.println(expectedTitle.equalsIgnoreCase(actualWebTitle)); // it checks for equality ignoring case
//		System.out.println(expectedTitle.length());
//		System.out.println(actualWebTitle.contains(expectedTitle));  // false
		System.out.println(expectedTitle.contains(actualWebTitle)); // true
//		System.out.println(strWithUpperCase.toLowerCase().contains(strWithLowerCase.toLowerCase())); // It'll check for content ignoring case

//		System.out.println(actualWebTitle.toUpperCase());
//		System.out.println(expectedTitle.toLowerCase());

		System.out.println(strWithUpperCase.charAt(strWithUpperCase.length() - 1));

		String original = "SprintQA";
		String rev = "";
		
		
		for(int i=original.length()-1; i>=0; i--) {
			rev = rev + original.charAt(i);
		}
		
		
		System.out.println(rev);
		

	}

}
