package com.sprintqa.java.class23;


class Cat {
	String color; // Object variable
	int numberOfLegs; // Object variable


	public Cat() { // User Defined Constructor
		color = "White";
		numberOfLegs = 2;
	

	}
		class CatConst (){
			public static void main(String[] args) {

		Cat MyCat = new Cat();
		System.out.println(MyCat.color);
		System.out.println(MyCat.numberOfLegs);
		
		
		System.out.println(MyCat.numberOfLegs);
	}

}
