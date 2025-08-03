package com.methods;

import java.util.Scanner;

public class Type2 
{
	public void demo(Scanner sc)
	{
		System.out.println("Enter Your Name ");
		String name=sc.next();
		System.out.println("Name is: " +name);
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
				Type2 t=new Type2();
				t.demo(sc);
				
				// you can pass an object to a method
				
	
	}

}
