package com.sprintqa.java.everyone;

public class ClassFromSelman {

	
		public static void main(String[] args) {
			int numbers[] = {14, 56, 37, 0, 23, 9, 2, 80, 67};

			int min=0;
	int temp=0;
	int indexOfMin=0;
	for( int i=0; i<numbers.length-1; i++)
	{
	min=numbers[i];
	for (int j=i; j<numbers.length; j++)
	{if (numbers[j]<min) {
		min=numbers[j];
		indexOfMin= j;
	}
	}
	//swapping of two numbers - numbers[indexOfMin], numbers[i]
	temp = numbers[indexOfMin];
	numbers[indexOfMin]=numbers[i];
	numbers[i]= temp;

	}
	for (int i =0; i<numbers.length; i++)
	System.out.println(numbers[i]);
	}
	
	}
	