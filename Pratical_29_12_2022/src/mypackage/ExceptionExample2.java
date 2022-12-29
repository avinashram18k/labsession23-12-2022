/*Write down a program where you take input of 2 number(i,j) from the user and divide the
 *  first number with second. Include exception handling mechanism*/

package mypackage;

import java.util.Scanner;

public class ExceptionExample2 {

	public static void main(String[] args) {
	Scanner sr=new Scanner(System.in);
	//take user input
	System.out.println("Enter your 1st number");
	int i=sr.nextInt();
	System.out.println("Enter your 2st number");
	int j=sr.nextInt();
	//using try-catch block to handle the exception
	try {
		System.out.println("Your answer is:"+i/j);
		
	}
	catch(ArithmeticException e)
	{
	
		System.out.println("Exception handle");
	}
	

	}

}
