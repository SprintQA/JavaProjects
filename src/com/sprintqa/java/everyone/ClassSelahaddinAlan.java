package com.sprintqa.java.everyone;
import java.util.Scanner;
public class ClassSelahaddinAlan {
	public static void main(String[] args) 
	{
	long n1,n2;
	String operator;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the operator(+,-,*,/): ");
			operator=sc.next();
			
			System.out.println("Enter the first number: ");
			n1 = sc.nextLong();
			
			System.out.println("Enter the second number: ");
			n2 =sc.nextLong();
			
			
			
			 switch (operator) {
			 case "+":
				 System.out.println(n1+n2);
				 break;
			 case "-":
				 System.out.println(n1-n2);
				 break;
			 case "/":
				 if (n2==0) {
					 System.out.println("Division by 0!");
				 }else 
				 System.out.println(n1/n2);
				 break;
			 case "*":
				 System.out.println(n1*n2);
				 break;
			default:
				System.out.println("Unknown Operator! ");
				  }
	}
}
