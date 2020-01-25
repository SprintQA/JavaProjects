package com.sprintqa.java.class12;

public class ForEachLoop {
	public static void main(String[] args) {
		int salary[] = { 2000, 5000, 1000, 500, 400, 700, 600, 600, 1200, 900 };

//		for (int i = 0; i < salary.length; i++) {
//			System.out.println(salary[i]);
//		}
		
	    // dataType varName : ArrayName
		
		for(int empSalary : salary) {
			System.out.println(empSalary);
		}

	}
}
