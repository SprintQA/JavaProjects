package com.sprintqa.java.reviewclass;

public class ModulusExample {
	public static void main(String args[]) {
		int result;

//		result = 10 % 2;

//		result = 17 % 3;
		
		result = 35 % 4;
		
		
		// To check number is odd or even we can do modulo with 2 and if it's even we will get result 0 and if
		// it's odd we will get result 1
		result = 15 % 2;
		
		
		// If we do modulo with 10 with number we will get last digit of number
		result = 15 % 10;

		System.out.print(result);
	}
}
