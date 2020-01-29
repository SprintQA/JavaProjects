package com.sprintqa.java.everyone;
import java.util.Scanner;
public class while_true_prime_with_method {
	
	public static int  prime() {
				
		System.out.println(" enter a number : ");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		
		boolean flag = false;

		for (int i = 2; i <= num1 - 1; i++) {
			
			if(num1==2 || num1==1) {
				break;
			}
			
			if (num1 % i == 0) {
				System.out.println(num1 + " is not prime");
				flag = true;
				break;
			}
		}

		if (flag == false) {
			System.out.println(num1 + " is  prime");
		}

		return num1;
	}
	
		
	public static void main(String[] args) {
	
		
	while(true) {System.out.println("*******************");
		System.out.println("to check a number  Prime or not  enter 1 or to quit enter 0");
		 Scanner sc=new Scanner(System.in);
		 
		 
		 int y=sc.nextInt();
		 	 
		 
		if (y==0) {
			System.out.println("Program ended");
			break;
		}
		else if (y==1) {
		
			prime();
			
		}
		else {System.out.println("enter 1 or 0");
			
	}
			
}
	
	
}}