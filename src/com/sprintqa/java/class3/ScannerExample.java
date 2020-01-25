package com.sprintqa.java.class3;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number...");

		int num = sc.nextInt();

		System.out.print("User has entered " + num);
	}

}
