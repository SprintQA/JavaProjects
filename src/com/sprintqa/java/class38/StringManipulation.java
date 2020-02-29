package com.sprintqa.java.class38;

public class StringManipulation {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String("Hello");

		// 1. Equals To check equality of two string
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2); // It'll give you false

		System.out.println();
		System.out.println("=====Equals with ignore case=====");

		// 2. Equals with ignore case
		String str3 = "HellO";
		String str4 = new String("heLLo");
		System.out.println(str3.equalsIgnoreCase(str4));

		System.out.println();
		System.out.println("=====Change to upper/lower case====");

		String str5 = "HellO";
		System.out.println(str5.toUpperCase());
		System.out.println(str5.toLowerCase());

		System.out.println();
		System.out.println("====Check one string contains another string====");

		String str6 = "This is my java program";
		String str7 = "java";
		System.out.println(str6.contains(str7));

		System.out.println();
		System.out.println("====Check one string contains another string Ignore Case====");

		String str8 = "This is my java program";
		String str9 = "JAVA";
		System.out.println(str8.toUpperCase().contains(str9.toUpperCase()));

		System.out.println();
		System.out.println("====Check String is empty or not====");

		String strA1 = "";
		System.out.println(strA1.isEmpty());

		System.out.println();
		System.out.println("====Index of char from string====");

		String strA2 = "This is my java program";
		System.out.println(strA2.indexOf('m'));
		System.out.println(strA2.indexOf('m', strA2.indexOf('m') + 1)); // 2nd index of m
		System.out.println(strA2.indexOf("java"));

		System.out.println();
		System.out.println("====char at index from string====");

		String strA3 = "This is my java program";
		System.out.println(strA3.charAt(4));

		System.out.println();
		System.out.println("====Replace====");

		String strA4 = "$300";
		System.out.println(strA4.replace("$", "#"));

		System.out.println();
		System.out.println("====Trim====");
		String strA5 = "   java program   ";
		String strA6 = "java";
//		System.out.println(strA5.trim().equals(strA6));
		System.out.println(strA5.trim());

		System.out.println();
		System.out.println("====Sub String====");
		String strA7 = "this is my java program";
		System.out.println(strA7.substring(8));
		System.out.println(strA7.substring(8, 15));

		System.out.println();
		System.out.println("====Split====");
		String strA8 = "this is my java my program";
		String[] words = strA8.split(" ");
		System.out.println(words[1]);
		System.out.println(words.length);
		
		System.out.println();
		System.out.println("====Length====");
		String strA9 = "this is my java program";
		System.out.println(strA9.length());

	}
}
