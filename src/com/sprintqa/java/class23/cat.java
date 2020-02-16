package com.sprintqa.java.class23;

public class cat {

	String colorofeyes;
	int numberoflegs;
	
		public cat () {
			
		}
		public cat (String color, int number) {
			colorofeyes= color;
			numberoflegs=number;
		}
			public static void main(String[]args) {
				
			cat mycat= new cat();
			mycat.colorofeyes = "Blue";
			
			cat yourcat = new cat("Brown",4);
			
			System.out.println(mycat.colorofeyes);
			
			System.out.println(yourcat.colorofeyes);	
				
			
		}
	
}
