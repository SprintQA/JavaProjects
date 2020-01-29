package com.sprintqa.java.class18;

public class Methods {

	public static void main(String[] args) {
<<<<<<< HEAD
		int num1=10, num2=20;
		
		System.out.println("addition" + (num1+num2));
		printLine();
		System.out.println("subtraction" + (num1-num2));
		printLine();
		System.out.println("multiplication" + (num1*num2));
		printLine();
		System.out.println("Division" + (num1/num2));
}

	public static void printLine() {
		
		System.out.println("=================");
	}
}
//public / private / protected / default
// [access specifier] [return type] [method name](){
// }
=======
		int num1 = 10, num2 = 20;
		System.out.println("Hello Wolrd!");
		printLine('*',10);			// Method call
		System.out.println("addition" + (num1 + num2));
		printLine('=',50);	
		System.out.println("sub" + (num1 - num2));
		printLine('-',30);	
		System.out.println("mul" + num1 * num2);
		printLine('#',5);	
		System.out.println("div" + num1 / num2);
	}
	
	
	// Defination
	public static void printLine(char patternChar, int limit) {
		for(int i=0; i<limit; i++) {
			System.out.print(patternChar);
		}
		
		System.out.println();
	}
	
	// Write a def of function to do sum of two numbers
	
//	public / private / protected / default
//	[access specifier][return type] [method_name](){
	
	
//	}

}
>>>>>>> ce11acecc90bb283615068e4b710dd19fe558435
