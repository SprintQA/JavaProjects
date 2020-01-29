package com.sprintqa.java.class18;

public class Methods {

	public static void main(String[] args) {
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