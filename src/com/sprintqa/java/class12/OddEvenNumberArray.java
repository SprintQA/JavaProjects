package com.sprintqa.java.class12;

public class OddEvenNumberArray {
	public static void main(String[] args) {
		// Count total number of odd number and total number of even number inside the
		// array

		int numbers[] = { 1, 6, 45, 71, 65, 34, 89 }, oddCount = 0, evenCount = 0; // Declaration and
																								// initialization

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		System.out.println("Number of even nubmers are " + evenCount);
		System.out.println("Number of odd nubmers are " + oddCount);

	}
}
