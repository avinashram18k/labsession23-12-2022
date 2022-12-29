/*write a program take the input of age from the user if the age is above 18 print 'you are eligible to vote' 
 * else throw an exception that 'age is not correct'*/

package mypackage;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age<18)
		{
			//throw exception if user is not eligible to vote	
			
		throw new ArithmeticException("Age is not Correct");
		}
		else
		{
			
			System.out.println("You are eligible to vote");
		}
		
	}

}
