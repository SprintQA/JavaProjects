package com.sprintqa.java.class36;

import java.util.HashMap;
import java.util.Map;

public class MapExample3 {
	public static void main(String[] args) {
		Map<String, Double> shoppingBag = new HashMap<String, Double>();

		shoppingBag.put("onion", 10.00);
		shoppingBag.put("cabbage", 4.59);
		shoppingBag.put("tomato", 6.5);
		shoppingBag.put("potato", 7.5);
		shoppingBag.put("butter", 6.5);

		System.out.println(shoppingBag.get("potato"));
		System.out.println(shoppingBag.containsKey("tomato"));
		System.out.println(shoppingBag.containsKey("cheese"));
		
		System.out.println(shoppingBag.containsValue(6.5));
		System.out.println(shoppingBag.containsValue(67.5));
		
		System.out.println(shoppingBag.size());
	}
}
