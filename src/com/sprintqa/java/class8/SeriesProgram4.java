package com.sprintqa.java.class8;

public class SeriesProgram4 {
	public static void main(String[] args) {
		// Write a program to print sum of below series

		// 1/2 + 2/3 + 3/4 +..+ 10/11

		// 1 + 2 + 3 + 4 + 5

		double sum = 0;

		for (double i = 1; i <= 10; i++) {
			sum = sum + i / (i + 1);
		}

		System.out.print(sum);

	}
}
