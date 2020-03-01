package com.sprintqa.java.class38;

public class FindSumOfElementFromArray {
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 60, 70, 80 };
		int sum = 0;

		for (int number : numbers) {
			sum = sum + number;
		}

		System.out.println("Sum= " + sum);

	}
}
