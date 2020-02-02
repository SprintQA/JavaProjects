package com.sprintqa.java.class9;

public class PatternProgram1 {
	public static void main(String[] args) {
		// Print star triangle single side
		// *
		// **
		// ***
		// ****
		// *****

		for (int i = 1; i <= 5; i++) { // Start of 1st(Row) for loop

			for (int j = 1; j <= i; j++) { // Start of 2nd(Column) for loop
				System.out.print("*");
			} // End of 2nd for loop

			System.out.println();
		} // End of first for loop
		

	}
}
