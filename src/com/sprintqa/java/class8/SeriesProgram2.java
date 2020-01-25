package com.sprintqa.java.class8;

public class SeriesProgram2 {
	public static void main(String[] args) {
		// Write a program to find result of multiplication of 1 to 5
		// Write a program to find the factorial of number

		// 5!  = 1 * 2 * 3 * 4 * 5

		// 1 + 2 + 3 + 4 + 5

		int mul = 1;

		for (int i = 1; i <= 3; i++) {
			mul = mul * i;
			System.out.println("iteration " + i + " value of i " + i + " " + "mul=" + mul);
		}

		System.out.println("mul value is " + mul);

	}
}
