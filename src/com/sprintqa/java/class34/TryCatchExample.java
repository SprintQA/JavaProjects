package com.sprintqa.java.class34;

import java.util.Scanner;

public class TryCatchExample {
	public static void main(String[] args) {

		int a[] = { 23, 34, 54, 31 , 15};
		String str = "$123";
		int i = 10, j = 12;
		Scanner sc = new Scanner(System.in);
		

		try {
			System.out.println(i / j); // Arithmetic Exception
			System.out.println(Integer.parseInt(str));
			System.out.println(a[4]); //ArrayIndexOutofBound
			System.out.println(sc.nextInt());
		} catch (ArithmeticException objOfException) {
			System.out.println("Cannot divide with zero");
		} catch (NumberFormatException objOfException) {
			System.out.println("Connot conver string to int");
		} catch (ArrayIndexOutOfBoundsException objOfException) {
			System.out.println("Please use correct index");
		}  catch (Exception objOfException) {
			System.out.println("Sorry! something went wrong");
		}

	}
}
