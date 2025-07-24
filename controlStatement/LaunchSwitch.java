package controlStatement;

import java.util.Scanner;

public class LaunchSwitch 
{

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int n1=sc.nextInt();
		
		System.out.println("Enter the second number");
		int n2=sc.nextInt();
		
		System.out.println("1=>add\n2=>mul\n3=>div\n4=>sub");
		
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println(n1+n2);
			break;
			
		case 2:
			System.out.println(n1*n2);
			break;
			
		case 3:
			System.out.println(n1/n2);
			break;
			
		case 4:
			System.out.println(n1-n2);
			break;
			
		default:
			System.out.println("Invalid case");
			break;
		
		
		}
		

	}

}
