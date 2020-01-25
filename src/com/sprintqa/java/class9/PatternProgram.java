package com.sprintqa.java.class9;

import java.util.Scanner;

public class PatternProgram {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numberOfRow = sc.nextInt();

		int numberOfCol = sc.nextInt();

		for (int i = 1; i <= numberOfRow; i++) { // Start of outer for loop

			for (int j = 1; j <= numberOfCol; j++) { // Start of inner for loop

				System.out.print(j + " ");

			} // End of inner for loop

			System.out.println();
		}  // End of outer for loop
	}
}
