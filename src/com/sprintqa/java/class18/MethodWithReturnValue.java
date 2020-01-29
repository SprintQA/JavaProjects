package com.sprintqa.java.class18;

import java.util.Scanner;

public class MethodWithReturnValue {
	public static void main(String[] args) {
		// Declaring & Assigning value to the int variable
		int num1=10, num2=20, result;
		
		// calling a function with two parameter and taking result into result variable
		result = sum(num1, num2);
		
//		result = num1 + num2
		
//		System.out.println(result);
		
		System.out.println(getUserInput());
	}
	
	
	
	
	
	
	
	// Method to perform addition of two number
	public static int sum(int a, int b){
		 return a + b;
	}
	
	// Method without parameter and return value
	public static String getUserInput() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	
	
}
