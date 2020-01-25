package com.sprintqa.java.class11;

public class PerfectNumber {

	public static void main(String[] args) {
		// Program to check number is perfect or not

		int num1 = 45, sum=0;

		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				sum = sum + i;
			}
		}
		
		if(sum==num1) {
			System.out.print("Perfect number");
		}else {
			System.out.print("Not Perfect number");
		}
		
		// 1 2 3 
		
		// 1, 2, 3, 5, 6 , 10, 15

		// 1, 2, 3, 4, 6, 8, 12
		
		// 1 + 2 + 4+ 7 + 14 = 28
		
		

	}

}
