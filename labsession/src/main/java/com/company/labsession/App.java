package com.company.labsession;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class App 
{
	public static void add() //Creating add method with try-catch block
	{
		try
		{
//Establish Connection with database
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/libmanagement", "root", "0000");
			
	//Preparing  Statement for inserting data into database
	PreparedStatement st=con.prepareStatement("insert into books(bid,bname)values(?,?)");
//taking user input
Scanner sc=new Scanner(System.in);	
System.out.println("Please Enter Your Book Name ");
String n =sc.nextLine();
System.out.println("Please Enter your Book Id");
int r=sc.nextInt();
 st.setInt(1, r);
 st.setString(2, n);
 // Executing Query
 st.executeUpdate();
 System.out.println("Data added Sucessfully");
 
 sc.close();// closing scanner 
 con.close();//closing connection 
			
		
		}
		catch(Exception e) 
		{
			System.out.println(e);// throwing exception
		}
	}
	
	//Creating Method For Update in Database
	public static void update()
	{
		try
		{
			
			//.Establish Connection with database
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/libmanagement", "root", "0000");
			
	//Preparing  Statement for update data into database
	PreparedStatement st=con.prepareStatement("update books set bname=? where bid=?");
	
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter Your Book Name");//Taking input from the user
		String n=sc.nextLine();
		System.out.println("Enter Your Book Id");
		int r=sc.nextInt();
		st.setString(1, n);
		st.setInt(2, r);
		st.executeUpdate();//For executing query
		
		System.out.println("Values Updated Successfully");
		sc.close(); //closing scanner class
		con.close(); //closing connection statement
			
			
			
		}
		catch(Exception e)//for Handling exception
		
		{
			System.out.println(e);
		}
	}
	
	//creating method for deleting data in database
	public static void delete()
	{
		try
		{
			

			//.Establish Connection with database
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/libmanagement", "root", "0000");
			
	//Preparing  Statement for deleting data into database
	PreparedStatement st=con.prepareStatement("delete from books where bid=?");
	
	Scanner sc=new Scanner (System.in);	
	System.out.println("Enter Your Book Id");	
	int r=sc.nextInt();
	st.setInt(1, r);
	st.executeUpdate();
	System.out.println("Your data Deleted Successfully");
	sc.close();
	con.close();
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);//throwing exception
		}
	}
	
	public static void display_books()
	
	{
		try {
			

			//.Establish Connection with database
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/libmanagement", "root", "0000");
			
	
	PreparedStatement st=con.prepareStatement("select*from books");
	ResultSet rs=st.executeQuery();
	while(rs.next())
	{
		System.out.println("Book Id:"+rs.getInt(1)+" "+"Book Name:"+rs.getString(2));
	}
	con.close();
	
	
			
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
	}
	
	
	
	
    public static void main( String[] args )
    {
    	System.out.println("Chosse Your Operation");
    Scanner sc=new Scanner(System.in);
    System.out.println("1.ADD 2.UPDATE 3. DELETE 4.DISPLAY 5.EXIT");
    int opr=sc.nextInt();
    switch(opr)
    {
    case 1:add();
    break;
    case 2: update();
    break;
    case 3: delete();
    break;
    case 4: display_books();
    break;
    
    default:
    	if(opr>4)
    	{
    		System.out.println("Successfully Exit");
    	}
    	else
    	{
    		System.out.println("Invalid Input");
    	}
    	break;
    }
    sc.close();
}
}

















