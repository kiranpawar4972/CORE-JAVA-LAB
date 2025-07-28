package methods;

import java.util.Scanner;

public class MenuDrivenCode 
{
	static Scanner sc=new Scanner(System.in);
	static int num1,num2,result;
	
	//1. NP,NRV
	public void addtion()
	{
		System.out.println("Enter 1st Number");
		 num1=sc.nextInt();
		System.out.println("Enter 2nd Number");
		 num2=sc.nextInt();
		 result=num1+num2;
		System.out.println("Addtion is: \n" +result);
		
	}
	//2. NP,RV
	public int multiplication()
	{
		System.out.println("Enter num1");
		num1=sc.nextInt();
		System.out.println("Enter num1");
	   	num2=sc.nextInt();
		result=num1*num2;
		return result;
		
	}
	//3.  P,NRV
	public void division(int num1,int num2)
	{
		
		 result=num1/num2;
		System.out.println("Division is: \n" +result);
	}
	//4. P,RV
	public int substraction(int num1,int num2)
	{
		result=num1-num2;
		return result;
	}
	
	
	public static void main(String[] args) 
	{
		MenuDrivenCode m=new MenuDrivenCode();
		
		int choice;
		//Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Press1: Addtion");
			System.out.println("Press2: multiplication");
			System.out.println("Press3: Division");
			System.out.println("Press4: Substraction");
			System.out.println("Press5: Exit");
			
			System.out.print("Enter Your Choice\n");
			 choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:m.addtion();
					break;
				
			case 2:int temp=m.multiplication();
			System.out.println("Multiplication is: " +temp);
				   	break;
				   	
				   	
			case 3: System.out.println("Enter 1st Number");
			 		num1=sc.nextInt();
			 		System.out.println("Enter 2nd Number");
			 		num2=sc.nextInt();	
			 		m.division(num1,num2);
					break;
					
			case 4: System.out.println("Enter num1");
					num1=sc.nextInt();
					System.out.println("Enter num1");
					num2=sc.nextInt();
					int tem=m.substraction(num1, num2);
					System.out.println("Substraction is: \n" +tem);
					break;
					
			case 5: System.out.println("Exit....Thank You:)  ");
			break;
					
			default:
				System.out.println("Invalid Choice");
				
			}	
		}
		while(choice!=5);
		
		
		
		
		

	}

}
