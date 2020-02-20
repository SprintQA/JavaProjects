package com.sprintqa.java.class34;

public class ThrowExample {
	public static void main(String[] args) throws Exception {

		int age = 17;

		if (age < 18) {
			Thread.sleep(3000);
			throw new ArithmeticException("Age should not be less than 18");
		} else {
			System.out.println("You're eligible");
		}

		System.out.println("Enter your DOB");
		System.out.println("Enter your Address");

		System.out.println("your DL request has been submitted");

	}
}
