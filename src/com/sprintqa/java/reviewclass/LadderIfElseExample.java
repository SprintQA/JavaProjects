package com.sprintqa.java.reviewclass;

public class LadderIfElseExample {

	// purchaseAmount <= 1000 - 5%
	// purchaseAmount <= 10000 - 10%
	// purchaseAmount <= 50000 - 20%
	// purchaseAmount >= 50000 - 25%

	public static void main(String[] args) {
		int purchaseAmount = 9000;

		if (purchaseAmount <= 1000) {
			System.out.println("5%");
		} else if (purchaseAmount > 10000 && purchaseAmount <= 50000) {
			System.out.println("20%");
		} else if (purchaseAmount <= 10000) {
			System.out.println("10%");
		} else {
			System.out.println("25%");
		}
	}

}
