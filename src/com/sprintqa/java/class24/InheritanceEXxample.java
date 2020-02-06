package com.sprintqa.java.class24;

class Calculator {  // Parent, Super, Base class

	public void sum(int num1, int num2) {
		System.out.println("Addition= " + (num1 + num2));
	}

	public void sub(int num1, int num2) {
		System.out.println("sub" + (num1 - num2));
	}
}

class AdvCalculator extends Calculator { // Child, Sub, Derived class

	public void mul(int num1, int num2) {
		System.out.println("mul= " + (num1 * num2));
	}

	public void div(int num1, int num2) {
		System.out.println("div" + (num1 / num2));
	}
}

public class InheritanceEXxample {
	public static void main(String[] args) {
		AdvCalculator ac = new AdvCalculator();
		Calculator c = new Calculator();
		ac.sum(10, 20);
		c.sum(10, 20);
	}
}
