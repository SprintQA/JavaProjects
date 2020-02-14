package com.sprintqa.java.reviewclass13Feb;

class Parent{
	
	Parent(int i){
		System.out.println("From parent class one arg");
	}
}

class Child extends Parent{

	Child(int i) {
		super(i);
	}
	
}




public class ThisAndSuper2 {
	public static void main(String[] args) {
		Child c = new Child(10);
	}
}
