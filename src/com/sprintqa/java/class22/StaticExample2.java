package com.sprintqa.java.class22;

class MathOperation {

	public static int getAbsValue(int number) {
		if (number > 0) {
			return number;
		} else {
			return number * (-1);
		}
	}

	public static int sum(int a, int b) {
		return a + b;
	}

}

public class StaticExample2 {

	public static void main(String[] args) {
		System.out.println(MathOperation.getAbsValue(-5));
	}

}
