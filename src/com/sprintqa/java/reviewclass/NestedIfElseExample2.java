package com.sprintqa.java.reviewclass;

public class NestedIfElseExample2 {
	// Student should be graduated - please complete graduation and apply again
	// Student should have 70% or above score - your score is lower than eligible criteria
	
	public static void main(String[] args) {
		boolean hasGraduationDegree = true;
		int marks = 65;
		
		
		if(hasGraduationDegree==true) {
			
			if(marks>=70) {
				System.out.print("You are eligible for interview");
			}else {
				System.out.print("your score is lower than needed");
			}
		}else {
			System.out.print("Please complete graduation and apply again");
		}
		
		
	}
}
