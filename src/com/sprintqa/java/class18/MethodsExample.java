package com.sprintqa.java.class18;

public class MethodsExample {

	public static void main(String[] args) {
int num1=10, num2=20;
		
		System.out.println("addition" + (num1+num2));
		printLine(10);
		System.out.println("subtraction" + (num1-num2));
		printLine(50);
		System.out.println("multiplication" + (num1*num2));
		printLine(30);
		System.out.println("Division" + (num1/num2));
		
}

	public static void printLine(int limit) {
		
		for (int i=0; i<limit; i++) {
		System.out.print("*");
	}System.out.println();
}
}

//public / private / protected / default
// [access specifier] [return type] [method name](){
// }
	


