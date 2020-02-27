package com.sprintqa.java.reviewclass_20_feb;

public class ExceptionHandlingExamples {

	public void div(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("number cannot divide with zero");
		} else {
			System.out.println(a / b);
		}
	}

	public static void main(String[] args) {
		ExceptionHandlingExamples eh = new ExceptionHandlingExamples();
		try {
			eh.div(10, 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
