package com.sprintqa.java.reviewclass_20_feb;

public class ExceptionHandlingExamples4 {

	public void div(int a, int b) {
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		ExceptionHandlingExamples4 eh = new ExceptionHandlingExamples4();
		
		
		try {
			eh.div(10, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Program ends");
	}

}
