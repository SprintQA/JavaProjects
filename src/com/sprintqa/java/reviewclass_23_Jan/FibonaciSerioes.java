package com.sprintqa.java.reviewclass_23_Jan;

public class FibonaciSerioes {
	// Write a program to print fib series till a limit given by user
	
	public static void main(String[] args) {
		// 0  1  1  2  3  5  8  13
		//       n1 n2 S
		
		int limit = 50, num1 =0, num2=1, sum=0;
		
		
		System.out.println(num1);
		System.out.println(num2);
		sum = num1 + num2;
		
		
		while(sum<limit) {
			System.out.println(sum);
			num1 = num2;
			num2 = sum;
			sum = num1 + num2;
		}
		
		
		
		
		
		// logic to print rest of the numbers
		
		
		
		
		
	}
}
