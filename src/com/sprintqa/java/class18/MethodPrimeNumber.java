package com.sprintqa.java.class18;

import java.util.Scanner;



public class MethodPrimeNumber {

	
	public static void  isPrime (int number) {
	
		
	 for (int i=2; i<=number; i++) {
	 if (number ==2 ||number ==1)  {
		 System.out.println(number + " is prime");
		break;
		} if(number%i==0) { System.out.println(number + " is not prime");
		
		break;
		}
		else { System.out.println(number + " is prime");
		break;
		}
	}
	}
	
public static void main(String[] args) {
    isPrime(4);
  }
}