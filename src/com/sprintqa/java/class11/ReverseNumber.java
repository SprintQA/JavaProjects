package com.sprintqa.java.class11;

public class ReverseNumber {

	public static void main(String[] args) {
		// Write a program to find reverse of given number

		int num1 = 15876, reverse = 0, lastDigit;

		while (num1 != 0) {
			 lastDigit = num1 % 10;
			 reverse=reverse*10 + lastDigit; // 3 , 32, 321
			 num1 = num1 / 10;
		}

		System.out.println(reverse);
	}

}
