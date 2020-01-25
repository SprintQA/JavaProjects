package com.sprintqa.java.class8;

public class SeriesProgram3 {

	public static void main(String[] args) {
		// Write a program to find sum of even number from 1 to 10
		// 2+ 4+ 6+ 8+ 10

		int sum=0;
		for (int i = 1; i <= 10; i++) {
			
			if (i % 2 == 0) {
				sum = sum + i;
			}
			System.out.println("iteration " + i + " value of i " + i + " " + "sum=" + sum);
		}
		
		System.out.print(sum);

	}

}
