/*Take a String from user and reverse it and also convert the same String to Upper case*/

package newpackage;

import java.util.Scanner;

public class ReverseExample {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your String");

StringBuilder stb=new StringBuilder();
stb.append(sc.nextLine());
System.out.println(stb.reverse());
String st=stb.toString();
System.out.println("Change into upper case  ="+st.toUpperCase());
	 
	}

}
