package controlStatement;

import java.util.Scanner;

public class LaunchDoWhileSwitch 
{

	public static void main(String[] args)
	{
		int result=0,num1,num2;
		Scanner sc=new Scanner(System.in);
		int choice=0;
		loop1:
		do
		{
			System.out.println("Press 1: Addtion");
			System.out.println("Press 2: Multiplication");
			System.out.println("Press 3: Division");
			System.out.println("Press 4: Substraction");
			System.out.println("Press 5: Exit");
			
			System.out.println("Enter your choice\n");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Addtion\n");
				System.out.println("Enter The Value num1");
				num1=sc.nextInt();
				System.out.println("Enter The Value num2");
				num2=sc.nextInt();
				result=num1+num2;
				System.out.println(result);
				break;
			case 2:
				System.out.println("Multiplication\n");
				System.out.println("Enter The Value num1");
				num1=sc.nextInt();
				System.out.println("Enter The Value num2");
				num2=sc.nextInt();
				result=num1*num2;
				System.out.println(result);
				break;
			case 3:
				System.out.println("Division\n");
				System.out.println("Enter The Value num1");
				num1=sc.nextInt();
				System.out.println("Enter The Value num2");
				num2=sc.nextInt();
				result=num1-num2;
				System.out.println(result);
				break;
			case 4:
				System.out.println("Substraction\n");
				System.out.println("Enter The Value num1");
				num1=sc.nextInt();
				System.out.println("Enter The Value num2");
				num2=sc.nextInt();
				result=num1/num2;
				System.out.println(result);
				break;
			case 5:
				System.out.println("Exit! Thank You...");
				if(choice==5)
					break loop1;
				
			default:
				System.out.println("Invalid case\n");
			
			}
			
		}
		//while(true);
		while(choice != 4);
		

	}

}
