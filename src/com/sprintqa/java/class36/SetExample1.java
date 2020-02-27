package com.sprintqa.java.class36;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample1 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		Set<Integer> setOfNumbers = new HashSet<Integer>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(50);
		numbers.add(30);
		numbers.add(50);

		System.out.println(numbers.size());
		int count = 0;

		for (int i : numbers) {
			if (setOfNumbers.add(i)) {
				
			} else {
				count++;
			}
		}

		System.out.println("Number of duplicate values " + count);
	}
}
