package com.sprintqa.java.class18;

import java.util.Scanner;

public class MethodWithReturnValue {
<<<<<<< HEAD

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
=======
	public static void main(String[] args) {
		// Declaring & Assigning value to the int variable
		int num1=10, num2=20, result;
		
		// calling a function with two parameter and taking result into result variable
		result = sum(num1, num2);
		
//		result = num1 + num2
		
//		System.out.println(result);
		
		System.out.println(getUserInput());
	}
	
	
	
	
	
	
	
	// Method to perform addition of two number
	public static int sum(int a, int b){
		 return a + b;
	}
	
	// Method without parameter and return value
	public static String getUserInput() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	
	
}
>>>>>>> ce11acecc90bb283615068e4b710dd19fe558435
