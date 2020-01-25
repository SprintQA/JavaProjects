package com.sprintqa.java.class12;

import java.util.Scanner;

public class SumOfPositiveAndNegativeNumber {
	public static void main(String[] args) {
		int numbers[] = new int[10]; // declaration of array and initialize with zero value

		Scanner sc = new Scanner(System.in);

		int positiveSum = 0, negativeSum = 0;

		// Taking data from user and assigning in each position

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}

		// Getting data from array and doing sum of positive and negative number

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				positiveSum = positiveSum + numbers[i];
			} else {
				negativeSum = negativeSum + numbers[i];
			}
		}

		System.out.println("Sum of positve number:  " + positiveSum);
		System.out.println("Sum of negative number:  " + negativeSum);

	}
}
