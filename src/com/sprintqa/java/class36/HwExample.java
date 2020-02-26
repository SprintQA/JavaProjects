package com.sprintqa.java.class36;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HwExample {
	public static void main(String[] args) {
		String line = "This is my first java program which includes collection and which is my fav topic";

		String words[] = line.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String wrd : words) {
			if(map.containsKey(wrd)) {
				map.put(wrd, map.get(wrd)+1);
			}else {
				map.put(wrd, 1);
			}
		}
		
		Set<String> allWords = map.keySet();
		for (String key : allWords) {
			System.out.println(key + " --  " + map.get(key));
		}

//		this - 1
//		is - 2
//		my - 2
//		first - 1

	}
}
