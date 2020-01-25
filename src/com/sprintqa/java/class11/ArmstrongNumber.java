package com.sprintqa.java.class11;

public class ArmstrongNumber {

	public static void main(String[] args) {

		// num1 = 173
		// 1^3 + 7^3 + 3^3 = 173

		//	 7^3 = 7*7*7
		//	 7^2 = 7*7

		int num1 = 372, sum = 0, lastDigit, backupOfNum1 = num1;

		while (num1 != 0) {
			lastDigit = num1 % 10;
			sum = sum + lastDigit * lastDigit * lastDigit;
			num1 = num1 / 10;
		}
		
		System.out.println(sum);
		System.out.println(backupOfNum1);
		
		if (sum == backupOfNum1) {
			System.out.println("number is armstrong");
		} else {
			System.out.println("number is not armstrong");
		}

	}

}
