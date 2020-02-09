package com.sprintqa.java.class27;

class SuperClass{
	
	public void displayName() {
		System.out.println("From SuperClass");
	}
	
	public void printHello() {
		System.out.println("Hello");
	}
}

class SubClass extends SuperClass{
	
	public void displayLine() {
		System.out.println("******");
	}
}



public class MethodOverridingExample2 {
	public static void main(String[] args) {
		SuperClass sc = new SuperClass();
		SubClass subCls = new SubClass();
//		sc.displayName();
//		subCls.displayName();
		
		SuperClass sc1 = new SubClass();
		sc1.displayName();
		sc1.printHello();
		sc1.displayLine();
		
	}
}
