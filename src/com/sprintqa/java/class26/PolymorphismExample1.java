package com.sprintqa.java.class26;
//Method OverLoading
//1. Number of parameter is different
//2. Same number of parameter and type of parameter is different

public class PolymorphismExample1 {
	//Method overloading - Same method name but different signature
		
	// Method without parameter
	public void show() {
		System.out.println("Inside show method with no parameter");
	}
	
	// Method with one parameter and type is int
	public void show(int i) {
		System.out.println("Inside show method with one paramter");
	}
	
	// Method with one parameter and type is double
	public void show(double i) {
		System.out.println("Inside show method with one paramter with double arguments");
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("This is from main method with argument");
//		PolymorphismExample1 p1 = new PolymorphismExample1();
//		p1.show(2.0);
	}
	public static void main() {
		System.out.println("This is from main method without argument");
	}
	
}
