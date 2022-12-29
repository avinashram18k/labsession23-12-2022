/*Write a Program take 2 String as input from the user and 
find if both the string are same or not.*/


package newpackage;

import java.util.Scanner;

public class StringExample1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your two string");
		
	String a=sc.nextLine();
	String b=sc.nextLine();
		
if(a.equals(b))
{
		
		System.out.println("Both Strings are same");
}
else
{
	System.out.println("They are not same");
}
		
	}

}
