/*Write a Program take 2 string as input from the user and find 
 * if first String exist in another*/

package newpackage;

import java.util.Scanner;

public class StringExample2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your two Strings");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		
		if(str1.contains(str2))
		{
			System.out.println("Its contain same String");
		}
		else
		{
			System.out.println("There is No such String");
		}

	}

}
