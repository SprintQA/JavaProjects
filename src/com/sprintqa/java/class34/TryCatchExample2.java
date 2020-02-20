package com.sprintqa.java.class34;

public class TryCatchExample2 {
	public static void main(String[] args) {

		int a[] = { 23, 34, 54, 31};
		String str = "123";
		int i = 10, j = 0;

		try {
			System.out.println(i / j); // Arithmetic Exception
		} catch (ArithmeticException objOfException) {
			System.out.println("Cannot divide with zero");
		}

		try {
			System.out.println(Integer.parseInt(str));
		} catch (NumberFormatException objOfException) {
			System.out.println("Connot conver string to int");
		}

		try {
			System.out.println(a[4]); // ArrayIndexOutofBound
		} catch (ArrayIndexOutOfBoundsException objOfException) {
			System.out.println("Please use correct index");
		}

	}
}
