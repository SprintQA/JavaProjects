package com.sprintqa.java.class12;

public class CountDigit {

	// Write a program to print number of digit in given number

	public static void main(String[] args) {
		// 123 - 3
		// 12368 - 5
		// 19087543287
		int num1 = 12, count=0;
		
		while(num1>0){
			num1 = num1 / 10;
			count++;
		}
		
		System.out.println(count);
	}

}
