package com.sprintqa.java.class23;
//prog to write parameterized and default constructors

class ConstructorExample2 {
	
	static String store;
	static String products;
	static int yearBuilt;
	static double avrgCheck;

	public ConstructorExample2() { // User Defined Constructor
		store = "Aldi";
		products = "onions";
		yearBuilt = 2017;
		avrgCheck = 90.87;
	}
		public static void main(String[] args) {
		ConstructorExample2	a = new ConstructorExample2();
		System.out.println(store);
		System.out.println(yearBuilt);
		System.out.println(products);
		System.out.println(avrgCheck);
	}
}