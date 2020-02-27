package com.sprintqa.java.class36;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		// 0 - chirag
		// 1 - Tafseer
		// 2 - Nodira
		// 3 - kamil
		// 4 - fatih
		List<String> cellPhoneNumberList = new ArrayList<String>();

		Map<String, String> phoneBook = new HashMap<String, String>();

		phoneBook.put("chirag", "1234567890");
		phoneBook.put("Tafseer", "000000000");
		phoneBook.put("Nodira", "4567890231");

		phoneBook.put("kamil", "7654321875");
		phoneBook.put("fatih", "1236542345");
		phoneBook.put("chirag", "000000000"); // Override
		
		
//		System.out.println(phoneBook.containsValue("4567890231"));
		
		
		System.out.println(phoneBook.isEmpty());
		

//		System.out.println(phoneBook.entrySet());

		// key - value

		Set<String> listOfKeys = phoneBook.keySet();
////
//		for (String stringKy : listOfKeys) {
//			String value = phoneBook.get(stringKy);
//			System.out.println("Calling... " + value);
//		}

	}
}
