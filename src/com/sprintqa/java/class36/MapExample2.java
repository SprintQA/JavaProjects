package com.sprintqa.java.class36;

import java.util.HashMap;
import java.util.Map;

class Dictionary {
	// Write a program to desing dictionary class for user
	Map<String, String> dictionary = new HashMap<String, String>();
	
	Dictionary() {
		dictionary.put("this", "used to identify a specific person or thing close at hand or being indicated or experienced");
		dictionary.put("java", "programming lanaguage");
		dictionary.put("selenium", "automation tool to automate the manual flow");
		dictionary.put("SprintQA", "place to learn automation");
	}
	
	
	public String getMeaning(String word) {
		return dictionary.get(word);
	}
	
	
}

public class MapExample2 {
	public static void main(String[] args) {
		Dictionary dict = new Dictionary();
		System.out.println(dict.getMeaning("Automation"));
	}
}
