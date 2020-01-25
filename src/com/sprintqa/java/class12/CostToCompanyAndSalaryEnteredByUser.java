package com.sprintqa.java.class12;

import java.util.Scanner;

public class CostToCompanyAndSalaryEnteredByUser {
	public static void main(String[] args) {
		int salary[] = new int[5]; // declaration of array and initialize with zero value
		
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		
		// Taking data from user and assigning in each position
		salary[0] = sc.nextInt();
		salary[1] = sc.nextInt();
		salary[2] = sc.nextInt();
		salary[3] = sc.nextInt();
		salary[4] = sc.nextInt();
		
		
		for(int i=0; i<salary.length;i++) {
			sum = sum + salary[i];
		}
		
		System.out.println("Cost to company: "+sum);
		

	}
}
