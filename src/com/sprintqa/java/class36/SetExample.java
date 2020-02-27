package com.sprintqa.java.class36;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		Set<Integer> values = new TreeSet<Integer>();
		Set<String> stringValues = new TreeSet<String>();
		
		values.add(90);
		values.add(20);
		values.add(110);
		values.add(10);
		values.add(120);
		
		stringValues.add("test");
		stringValues.add("test");
		stringValues.add("demo");
		stringValues.add("tester");
		
		
		for(String i : stringValues) {
			System.out.println(i);
		}
		
//		for(int i : values) {
//			System.out.println(i);
//		}
		
		
	}
}
