package com.sprintqa.java.class9;

public class SeriesHomeWorkExample2 {

	public static void main(String[] args) {
		// Find result of 1^2 + 2^2 + 3^2 +..+10^2

		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum = sum + i * i;
		}

		System.out.println(sum);

	}

}
