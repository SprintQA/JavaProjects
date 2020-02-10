package com.sprintqa.java.class26;

class MathOperation {

	public void sum(int a, int b) {
		System.out.println(a + b);
	}

}

public class MethodOverLoadingExample4 {
	public static void main(String[] args) {
		MathOperation mo = new MathOperation();
		mo.sum(10, 20);
	}
}
