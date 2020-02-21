package com.sprintqa.java.reviewclass_20_feb;

class VehicalDrivingTest {

	public void checkAge(int age) throws Exception {
		if (age < 18) {
			throw new Exception("age cannot be less than 18");
		} else {
			System.out.println("You're eligible");
		}
	}

	public void checkDrivingTestResult(boolean isPassed) throws Exception {
		if(isPassed == true) {
			System.out.println("you've cleared the test");
		}else {
			throw new Exception("Pleaes try next time");
		}
	}

}

public class ExceptionHandlingExample2 {
	public static void main(String[] args) throws Exception {
		int age = 20;
		VehicalDrivingTest driverTest = new VehicalDrivingTest();
		driverTest.checkAge(age);
		driverTest.checkDrivingTestResult(false);
		System.out.println("Your DL is ready");
	}
}
