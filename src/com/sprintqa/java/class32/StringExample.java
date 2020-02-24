package com.sprintqa.java.class32;

public class StringExample {
	public static void main(String[] args) {

		// Immutable
		String str = "Hello";
		str = str.toUpperCase();
		System.out.println(str);

		// Mutable
		StringBuffer sb = new StringBuffer("Hello");
		sb.reverse();
		System.out.println(sb);

//		Mutable
		StringBuilder sb1 = new StringBuilder("Hello");
		sb1.reverse();

		System.out.println(sb1);
	}
}
