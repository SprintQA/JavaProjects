package com.sprintqa.java.class12;

public class SumOfEachRow_HomeWork {

	// Print each row sum seperatly into console
	public static void main(String[] args) {
		int numbers[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		// sum of row 1 - 60
		// sum of row 2 - 150
		// sum of row 3 - 240

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum = 0;
			for (int j = 0; j < numbers[i].length; j++) {
				sum = sum + numbers[i][j];
			}
			System.out.println("Sum of row " + i + "  =" + sum);

		}

	}
}
