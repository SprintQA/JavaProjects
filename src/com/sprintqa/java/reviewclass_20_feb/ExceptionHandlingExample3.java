package com.sprintqa.java.reviewclass_20_feb;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class Bank {

	public void methodA() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in); // get data from user
		FileReader fr = new FileReader("C:\\test.txt");
	}

	public void methodB() throws FileNotFoundException {
		methodA();
	}

	public void methodC() {
		try {
			methodB();
		} catch (FileNotFoundException e) {
			System.out.println("File path has to be correct");
		}
	}

	public void methodD() {
		methodC();
	}

}

public class ExceptionHandlingExample3 {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.methodC();
	}
}
