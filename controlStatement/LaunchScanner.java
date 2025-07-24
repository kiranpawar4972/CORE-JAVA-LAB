package controlStatement;

import java.util.Scanner;

public class LaunchScanner 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of byte");
		byte b=sc.nextByte();
		System.out.println("value of b is: " +b);
		
		System.out.println("Enter the value of short");
		short s=sc.nextShort();
		System.out.println("value of s is: " +s);
		
		System.out.println("Enter the value of int");
		int i=sc.nextInt();
		System.out.println("value of i is: " +i);
		
		System.out.println("Enter the value of long");
		long l=sc.nextLong();
		System.out.println("value of l is: " +l);
		
		System.out.println("Enter the value of float");
		float f=sc.nextFloat();
		System.out.println("value of i is: " +f);
		
		System.out.println("Enter the value of double");
		double d=sc.nextDouble();
		System.out.println("value of i is: " +d);
		
		System.out.println("Enter the value of boolean");
		char c=sc.next().charAt(0);
		System.out.println("value of i is: " +c);
		

	}

}
