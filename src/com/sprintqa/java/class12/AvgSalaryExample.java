package com.sprintqa.java.class12;

public class AvgSalaryExample {
	public static void main(String[] args) {
		int salary[] = { 2000, 5000, 1000, 500, 400, 700, 600, 600, 1200, 900 }, sum=0; // Declaration and initialization
		
		
		for(int i=0; i<salary.length;i++) {
			sum = sum + salary[i];
		}
		
		
		System.out.println("Total cost: "+sum);
		System.out.println("Avg Salary Per Emp : "+sum/salary.length);
		
	}
}
