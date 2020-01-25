package com.sprintqa.java.class4;

public class LogicalOperator2 {

	public static void main(String[] args) {

		boolean b1 = true, b2 = false, b3 = true, result; // Logical operator (&&, ||, !)

//		result = b2 || b1 && b3;

//		result = true || true && false && true && false || false || true && true;
		
//		result = false || true && true || true && false && true && false || false && false;
		
		result = true && false && true && true && true && true || false || false && true;
		

		System.out.print(result);

	}

}
