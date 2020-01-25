package com.sprintqa.java.class11;

public class SumOfDigit {
	public static void main(String[] args) {
		// Write a program to take number from user and print sum of it's digit
		
		int num1 = 123456,sum=0, lastDigit;
		
		// 3 + 7 + 2
		
		
		while (num1 != 0) {
			lastDigit = num1 % 10;
			sum = sum + lastDigit;
			num1 = num1 / 10;
		}
		
		System.out.print(sum);
		
		
		
		
	}
}
