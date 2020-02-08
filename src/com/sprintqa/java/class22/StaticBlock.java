package com.sprintqa.java.class22;

class StaticBlkDemo{
	static int i;
	
	static{
		i=0;
		System.out.println("1. Inside static block");
	}
	
}
public class StaticBlock {

	public static void main(String[] args) {
//		System.out.println(StaticBlkDemo.i);
//		StaticBlkDemo.i=10;
//		System.out.println("2. Inside main method");
	}
	
	
	static {
		System.out.println("Hello world!");
	}

}
