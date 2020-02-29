package com.sprintqa.java.class38;

class Calculator {
	int num1, num2;

	
	public void sum() {
		System.out.println(num1 + num2);
	}
	public void sub() {
		System.out.println(num1 - num2);
	}
}

class AdvCal extends Calculator{
	AdvCal(int num1, int num2){
		System.out.println("From child class");
	}
	
	public static final void mul() {
		 int num1;
	}
	
	public void div() {
		System.out.println(num1 / num2);
	}
}
public class OOPExample3 {
	public static void main(String[] args) {
		AdvCal ac1 = new AdvCal(10,20);
//		Calculator c = new Calculator();
//		Calculator c1 = new Calculator(5, 7);
		ac1.sum();

	}
}
