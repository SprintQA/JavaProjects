package com.sprintqa.java.class31;

class Parent {
	
	Parent(int a){
		System.out.println("From parent class");
	}

}

class Child extends Parent{

	Child(){
		super(10);
		System.out.println("From Child class");
	}

}

public class ExampleOfSuperAndThis {
	
	public static void main(String[] args) {
		Child c = new Child();
	}

}
