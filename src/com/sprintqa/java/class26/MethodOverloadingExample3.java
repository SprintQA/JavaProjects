package com.sprintqa.java.class26;

class Calculator {
	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	public void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void sum(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);

	}

	public void sum(double a, double b) {
		System.out.println(a + b);
	}

}

public class MethodOverloadingExample3 {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.sum(10.50, 20.10);

	}
}
