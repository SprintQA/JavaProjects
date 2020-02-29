package com.sprintqa.java.class38;

public class TwoDArray {
	public static void main(String[] args) {
		int numbers[][] = { { 1, 2, 3, 8, 4 }, { 4, 5, 6, 7, 6 }, { 7, 8, 9, 10, 9 } };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}

			System.out.println();
		}

	}
}
