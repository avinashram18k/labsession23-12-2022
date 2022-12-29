//Create a thread to find if the number is odd or even
package mypackage;

import java.util.Scanner;

public class ThreadExample {

	public static void main(String[] args) {  
		Even_Odd ev=new Even_Odd();
		ev.start();
		System.out.println("Thread is running");

	}

}
class Even_Odd extends Thread
{
	public void run()
	
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter a number");
		int num=s.nextInt();
		
		if(num % 2==0)
		{
			System.out.println(num +":is Even");
		}
		else
		{
			System.out.println(num +": is Odd ");
		}
	}
	
}
