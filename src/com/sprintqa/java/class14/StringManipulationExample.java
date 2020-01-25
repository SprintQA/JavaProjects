package com.sprintqa.java.class14;

public class StringManipulationExample {

	public static void main(String[] args) {
		String str = "1234";
		System.out.println(str.isEmpty()); // it'll return true if string blank otherwise false
		
		System.out.println("=====Trim========");
		
		String str1 = "           Welcome to SprintQA                ";
		String expectedTitle = "Welcome to SprintQA";
		System.out.println(str1.trim().equals(expectedTitle)); // trim() will remove extra space before and after the string
		
		System.out.println("=====Replace========");
		
		String str2 = "I am an Automation Enginner";
		String str3 = str2.replace("Automation Enginner", "Programmer");
		System.out.println(str2);
		System.out.println(str3);
						
		
		System.out.println("=====IndexOf========");
		//             01234567890123456789
		String str4 = "Welcome to SprintQA! This is Chirag from SprintQA";
		String str5 = "Welcome to SprintQA! This is Chirag from SprintQA We are going to learn automationQA";
		System.out.println(str4.indexOf("QA")); // 17
		System.out.println(str4.lastIndexOf("QA")); // 47
		System.out.println(str5.indexOf("QA", str5.indexOf("QA")+1));
		
		
		System.out.println("=====SubString========");
		String str6 = "Welcome to SprintQA!";
		String str7 = "Welcome to SprintQA! This is Chirag from SprintQA We are going to learn automationQA";
		System.out.println(str7.substring(11, 20)); // substring will return string at specified position
		
		
		System.out.println("=====Format========");
		String companyName = "SprintQA!";
		String trainerName = "XYZ";
		
		String title = "Welcome To %s! This is %s from %s We are going to learn automationQA";
		System.out.println(String.format(title, companyName,trainerName,companyName));
		
		System.out.println("=====CompareTo========");
		
		String str8 = "Amazon";
		String str9 = "SprintQA";
		String str10 = "Amazon";
		System.out.println(str8.compareTo(str9));  // Negative
		System.out.println(str9.compareTo(str8));  // Positive
		System.out.println(str8.compareTo(str10));  // Zero
		
		
		
		System.out.println("=====Split========");
		
		String str11 = "Welcome-to-SprintQA";
		String str12 = "Welcome to SprintQA! This is Chirag from SprintQA We are going to learn automationQA";
		
		String words[] = str12.split(" ");
		System.out.println(words.length);
		
		
		
//		String[] words =  str11.split("-");
//		System.out.println(words[0]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
