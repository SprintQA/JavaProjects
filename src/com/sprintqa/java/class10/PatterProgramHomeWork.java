package com.sprintqa.java.class10;

public class PatterProgramHomeWork {

//	    1
//	   121
//	  12321
//	 1234321 
//	123454321 

//     1
//    121
//   12312
//  1234123 
// 123451234

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			
			for (int k = 1; k <= 5-i; k++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			
			for (int j = 5; j <= i-1; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}

}
