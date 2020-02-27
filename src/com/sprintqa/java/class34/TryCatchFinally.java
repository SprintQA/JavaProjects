package com.sprintqa.java.class34;

public class TryCatchFinally {
	public static void main(String[] args) {

		int a[] = { 23, 34, 54, 31 };
		String str = "123";
		int i = 10, j = 20;

		try {
			System.out.println(i / j); // Arithmetic Exception
			System.out.println(Integer.parseInt(str));
			System.out.println(a[4]); // ArrayIndexOutofBound
			System.out.println("Smooth execution of all three stmt");
		} catch (ArithmeticException objOfException) {
			System.out.println("Cannot divide with zero");
		} catch (NumberFormatException objOfException) {
			System.out.println("Connot convert string to int");
		} catch (ArrayIndexOutOfBoundsException objOfException) {
			System.out.println("Please use correct index");
		} catch (Exception objOfException) {
			System.out.println("Sorry! something went wrong");
		} finally {
			System.out.println("Program ends");
		}
	}
}
