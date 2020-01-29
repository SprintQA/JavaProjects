package com.sprintqa.java.everyone;

import java.util.Scanner;

public class class4 {


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
				System.out.println("Number is not prime");
				flag = true;
				break;
			}
		}

		if (flag == false) {
			System.out.println("Number is prime number");
		}

		return num1;
	}
	
	
	

		public static void main(String[] args) {

			prime();
			
			
			
			
			

	}}
