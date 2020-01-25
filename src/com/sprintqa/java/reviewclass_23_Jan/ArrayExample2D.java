package com.sprintqa.java.reviewclass_23_Jan;

public class ArrayExample2D {
	
	// Transpose of matrix
	// 1 4 7
	// 2 5 8 
	// 3 6 9
	public static void main(String[] args) {
		int numbers[][] = { { 1, 2, 3 }, 
							{ 4, 5, 6 },
							{ 7, 8, 9 } 
						};
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[j][i]+" ");
			}
			System.out.println();
		}
		
	}
}
