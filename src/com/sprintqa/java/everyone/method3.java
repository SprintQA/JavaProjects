package january_28;

import java.util.Scanner;

public class method3 {

	
public static int sum(int a, int b ) {
		int c=a+b;
		return  c;	
		
	}

		public static void main(String[] args) {
		
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println(" Enter two numbers :");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
    
	int result=sum(num1, num2)	;
	
	System.out.println(num1+ " + " + num2 + " = " + result);
		
	
	}

}
