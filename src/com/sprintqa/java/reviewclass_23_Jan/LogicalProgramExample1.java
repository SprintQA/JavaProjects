package com.sprintqa.java.reviewclass_23_Jan;

public class LogicalProgramExample1 {
	// Write a program to check given number is prime or not

	// 2 3 4 5 6 7 8 9 10 11 12

	// Not prime - if we found any number that divides current number that it's not
	// prime
	// prime - we have to check all the numbers and if still we are not getting
	// divisor of current number then we can it's prime

	public static void main(String[] args) {
		int num1 = 13,i, y=0;

		for ( i = 2; i <= num1 - 1; i++) {
			if(num1%i==0) {
				y=1;
				System.out.print("not prime");
				break;
			}
		}
		
		if(y==0) {
			System.out.print("Number is prime");
		}
		

	}
}
