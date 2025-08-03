package com.methods;

import java.util.Scanner;

public class Type3 
{
		// you can return an object from a method
	
		public Scanner car()
		{
			Scanner sc=new Scanner(System.in);
			return sc;
		}
	
	
	public static void main(String[] args) 
	{
		Type3 t=new Type3();
		Scanner sc=t.car();
		
		System.out.println("enter your number");
		int num=sc.nextInt();
		System.out.println("Your Number is: "+num);

	}

}
