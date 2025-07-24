package controlStatement;

import java.util.Scanner;

public class LaunchSwitch2
{

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int n1=sc.nextInt();
		
		System.out.println("Enter the second number");
		int n2=sc.nextInt();
		
		System.out.println("a=>add\nb=>mul\nc=>div\nd=>sub");
		
		System.out.println("Enter your choice");
		char choice=sc.next().charAt(0);
		
		switch(choice)
		{
		case 'a':
			System.out.println(n1+n2);
			break;
			
		case 'b':
			System.out.println(n1*n2);
			break;
			
		case 'c':
			System.out.println(n1/n2);
			break;
			
		case 'd':
			System.out.println(n1-n2);
			break;
			
		default:
			System.out.println("Invalid case");
			break;
		
		
		}
		

	}

}
