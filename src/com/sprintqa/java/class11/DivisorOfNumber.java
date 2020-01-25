package com.sprintqa.java.class11;

public class DivisorOfNumber {
	
	// Find divisor of given number
	public static void main(String[] args) {
		// 15 - 1, 3, 5, 15
		// 24 - 1, 2, 3, 4, 6, 8, 12, 24
		
		int num1 = 24;
		
		for(int i=1; i<=num1; i++) {
			if(num1 % i==0) {
				System.out.println(i);
			}
		}
		
		// 1, 2, 4, 7, 14, 28
		
		
	}
}
