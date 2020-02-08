package com.sprintqa.java.class25;

class X {
	public X(int a, int b) {
		System.out.println(a);
		System.out.println(b);
		System.out.println("From class X");
	}
}

class Y extends X {
	
	public Y(int firstArg, int secondArg){
		super(secondArg,firstArg);
		// statements of contstructor Y
	}
}


public class ConstructorChainingExample3 {
	public static void main(String[] args) {
		Y y1 = new Y(10,20);
		
	}
}
