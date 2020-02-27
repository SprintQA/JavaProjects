package com.sprintqa.java.class37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Examples {
	public static void main(String[] args) {

//		List - ordered collection of data

//		Two class implements list interface
//		1. ArrayList
//		2. LinkedList

//	ArrayList - it follows the sequential order to store the data
//	LinkedList - it follows the doubly linked list approach to store the data

// Difference between ArrayList and LinkedList
//		1.Searching & data Retrival is easy in ArrayList
//		2.Insertion and Deletion is easy in LinkedList

		// Declaration of List
		List<Integer> values = new ArrayList<Integer>();

		values.add(10); // stored at index 0
		values.add(30); // stored at index 1
		values.add(60); // stored at index 2

		values.remove(1);

		values.add(1, 30);

		System.out.println(values);

		// Traverse element stored inside List
		// 1. Index based for loop
		// 2. For each loop / Enhance for loop
		// 3. Iterator

		// 1. index based for loop
		System.out.println("=======Index based for loop======");
		for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i));
		}

//		2. For Each loop
		System.out.println("=======For each loop======");
		for (int data : values) {
			System.out.println(data);
		}

//		3. Iterator
		System.out.println("=======Iterator======");
		Iterator<Integer> itr = values.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Set - Unordered collection of data which doesn't allow duplicate values
		// Classes that implement Set interface
		// 1. HashSet - It doesn't reserved order of element
		// 2. TreeSet - Store data in sorted manner
		// 3. LinkedHashSet - It reserve the insertion order but implementation
		// differs(double linked
		// list approach)

		// Declaration of Set and initialize with HashSet
		Set<Integer> setValues = new HashSet<Integer>();

		setValues.add(10);
		setValues.add(30);
		setValues.add(60);
		setValues.add(30); // Duplicates not in set allowed it'll ignore
		setValues.add(10); // Duplicates not in set allowed it'll ignore

//		Iterator to traverse value stored inside hashset
		System.out.println("=======Value inside HashSet======");
		Iterator<Integer> setItr = setValues.iterator();
		while (setItr.hasNext()) {
			System.out.println(setItr.next());
		}

		// Declaration of Set and initialize with TreeSet
		Set<Integer> treeSetValues = new TreeSet<Integer>();

		treeSetValues.add(10);
		treeSetValues.add(90);
		treeSetValues.add(30);
		treeSetValues.add(5);
		treeSetValues.add(40);
		treeSetValues.add(10); // Duplicates not in set allowed it'll ignore
		treeSetValues.add(30); // Duplicates not in set allowed it'll ignore

//		Iterator to traverse value stored inside tree set
		System.out.println("=======Value inside TreeSet======");
		Iterator<Integer> treeSet = treeSetValues.iterator();
		while (treeSet.hasNext()) {
			System.out.println(treeSet.next());
		}

		// LinkedHashSet will reserve the insertion order
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();

		linkedHashSet.add(10);
		linkedHashSet.add(90);
		linkedHashSet.add(30);
		linkedHashSet.add(5);
		linkedHashSet.add(40);
		linkedHashSet.add(10); // Duplicates not in set allowed it'll ignore
		linkedHashSet.add(30); // Duplicates not in set allowed it'll ignore

//		Iterator to traverse value stored inside tree set
		System.out.println("=======Value inside LinkedHashSet======");
		Iterator<Integer> lnkItr = linkedHashSet.iterator();
		while (lnkItr.hasNext()) {
			System.out.println(lnkItr.next());
		}

		// Map - Map interface stored data into key value pair
		// Classes that implement map interface
		// 1. HashMap - stored data into key value manner, unordered, key cannot be
		// duplicate but value can
		// 2. HashTable - Same as HashMap but it's thread safe
		// 3. TreeMap - Data stored in sorted manner
		// 4. LinkedHashMap - It reserved the order of insertion

		// Declaration of HashMap
		Map<Integer, String> days = new HashMap<Integer, String>();
		days.put(0, "Sunday");
		days.put(1, "Monday");
		days.put(2, "Tue");
		days.put(3, "Wed");

		// Get value inside hashmap
		System.out.println("=======Get Value inside map======");
		System.out.println(days.get(1));
		
		System.out.println("=======Contains value Friday?======");
		System.out.println(days.containsValue("Friday"));

		System.out.println("=======Value inside HashMap======");
		Set<Integer> allKeys = days.keySet();
		for (int key : allKeys) {
			System.out.println(key + " --  " + days.get(key));
		}

	}
}
