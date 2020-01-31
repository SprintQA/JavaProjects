package com.sprintqa.java.class18;

public class Methods {

	public static void main(String[] args) {

		int num1=10, num2=20;
		
		
		System.out.println("Hello World");
		System.out.println("============================");
		System.out.println("addition "+(num1+num2));
		PrintLn('*',10); 
		System.out.println("substraction "+(num1-num2));
		//PrintLn(50); 
		System.out.println("multiplication "+num1*num2);
		System.out.println("division "+num1/num2);
	}

	public static void PrintLn(char Characterp, int limit) {
		for (int i=0; i<=limit; i++)
		System.out.print(Characterp);
	}
	
}
