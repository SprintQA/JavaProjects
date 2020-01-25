package com.sprintqa.java.class10;

public class PatternProgram3 {
	
		//    1
		//   12
		//  123
		// 1234
		//12345

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int k = 1; k <= 5 - i; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {

				System.out.print(j);
			}

			System.out.println();
		}
	}

}
