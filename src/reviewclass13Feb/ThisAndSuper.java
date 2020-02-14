package com.sprintqa.java.reviewclass13Feb;


class Demo{
	int a=10;
	
	// 1. Inside constructor we can have only one call to the 
//		  another constructor
//	   2. We can call other constructor from one constructor from 
//	      the first line only
	
	Demo(){
		this(10,20);
		System.out.println("Zero argument");
	}
	
	Demo(int a){
		System.out.println("One argument");
	}
	
	Demo(int a, int b){
		this(10);
		System.out.println("Two arguments");
	}
	
	public void display() {
//		int a=20;
		System.out.println(this.a);
	}
}

public class ThisAndSuper {
	
	public static void main(String[] args) {
		Demo d = new Demo();
	}
}
