package controlStatement;

import java.util.Scanner;

public class LaunchIfElseLadder2 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		
		System.out.println("enter num2: ");
		int num2=sc.nextInt();
		
		System.out.println("1->add\n2->mul\n3->div\n4->div");
		
		System.out.println("enter your choice: ");
		int choice=sc.nextInt();
		
		if(choice==1)
		{
			System.out.println(num1+num2);
		}
		else if(choice==2)
		{
			System.out.println(num1*num2);
		}
		else if(choice==3)
		{
			System.out.println(num1/num2);
		}
		else if(choice==4)
		{
			System.out.println(num1-num2);
		}
		else
		{
			System.out.println("invalid Choice");
		}
		

	}

}
