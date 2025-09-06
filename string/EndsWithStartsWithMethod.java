package com.string;

import java.util.Scanner;

public class EndsWithStartsWithMethod 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter Your Email ID: ");
		String email=sc.nextLine();
		
		boolean startWith=email.startsWith("pk");
		System.out.println(startWith);
		
		if(startWith)
			System.out.println("Email is Vaild");
		else
			System.out.println("invalid Email");
		
		
		boolean endsWith=email.endsWith("gmail.com");
		System.out.println(endsWith);
		
		if(endsWith)
			System.out.println("valid email");
		else
			System.out.println("invalid email");
	
	}

}
