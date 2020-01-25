package com.sprintqa.java.reviewclass_23_Jan;

public class ArrayExampleHomeWork {

	// Write a program to sort array element in ascending order
	// output should be 0 2 9 14 23 37 56 67 80

	// 14, 56, 37, 0, 23, 9, 2, 80, 67
	// 0 56 37 14 23 9 2 80 67
	// 0 2 37 14 23 9 56 80 67
	// 0 2 9 14 23 37 56 80 67
	// 0 2 9 14 23 37 56 80 67
	public static void main(String[] args) {
		int numbers[] = { 14, 0, 23, 9, 2 , 80, 90 ,67, 34, 36, 12}, min = 0, temp = 0, indexOfMin = 0;
//						   0  1   2  3  4 

		for (int i = 0; i < numbers.length - 1; i++) {

			min = numbers[i];
			for (int j = i; j < numbers.length; j++) {
				if (numbers[j] < min) {
					min = numbers[j];
					indexOfMin = j;
				}
			}

			// swapping of two number - numbers[indexOfMin], numbers[i]
			temp = numbers[indexOfMin];
			numbers[indexOfMin] = numbers[i];
			numbers[i] = temp;

		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
