package com.sprintqa.java.class11;

public class Palindrome {

	public static void main(String[] args) {
		// Write a program to check given number is palindrome or not

		int num1 = 121, reverse = 0, lastDigit, backOfnum1 = num1;

		while (num1 != 0) {
			 lastDigit = num1 % 10;
			 reverse=reverse*10 + lastDigit; // 3 , 32, 321
			 num1 = num1 / 10;
		}

		if(reverse == backOfnum1) {
			System.out.print("Palindrome");
		} else {
			System.out.print("Not Palindrome");
		}
		
		

	}

}
