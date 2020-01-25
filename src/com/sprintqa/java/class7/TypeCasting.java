package com.sprintqa.java.class7;

public class TypeCasting {

	public static void main(String[] args) {

		// Implicit Type casting
		// widening
		int num1 = 10;
		double num2;
		num2 = num1;

		// Explicit type casting
		// narrowing

//		double num1 = 10.9;
//		int num2;
//		num2 = (int)num1;   // We are converting double data type to int so it'll store only int value of double

		System.out.print(num2);
	}

}
