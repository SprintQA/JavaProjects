package com.sprintqa.java.class18;

import java.util.Scanner;

public class MethodWithReturnValue {

	public static void main(String[] args) {
//	int num1=10, num2=20, result;
	
//	result =sum(num1, num2);
	//System.out.println(result);
	System.out.println(getUserInput());
	}

	public static int sum (int num1, int num2) {
		return num1+num2;
	}
	public static String getUserInput() {
		Scanner sc=new Scanner (System.in);
		return sc.nextLine();
}
}