package com.sprintqa.java.reviewclass;

public class NestedIfElseExample {

	// write a program to authenticate user based on credential

	// if usernmae is incorrect - break the condition and print message "username is
	// incorrect"
	// if username is correct and passsword is incorrect then print message
	// "password is incorrect"
	// if both are valid then print "login successful"

	public static void main(String[] args) {
		int dbUsername = 300;
		int dbPassword = 1234;

		int inputUsername = 300;
		int inputPassword = 1234;

		
		if (dbUsername == inputUsername) { // 1st condition if block, check this condition 1st
			
			// check this condition if and only if first condition is correct
			if(dbPassword == inputPassword) { // 2nd condition if block
				System.out.println("Login successful");
			}else { 							// 2nd condition else block
				System.out.println("Password is incorrect");
			}
			
			
		} else { // 1st condition else block
			System.out.println("Entered user is not found");
		}
	}
}
