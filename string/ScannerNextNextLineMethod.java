package com.string;

import java.util.Scanner;

public class ScannerNextNextLineMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Roll No: ");
		int rollNo=sc.nextInt();
		System.out.println(rollNo);
		
		sc.nextLine();      // consume new line
		
		System.out.println("Enter Your Name: ");
		String name=sc.nextLine();
		System.out.println(name);
		
		
		// String Escape Sequence
		
		System.out.println("\n");
		
		System.out.println("kiran\npawar");
		System.out.println("kiran\tpawar");
		System.out.println("kiran\"pawar\"");

	}

}
