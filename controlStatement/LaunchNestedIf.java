package controlStatement;

import java.util.Scanner;

public class LaunchNestedIf 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Percentage");
		float per=sc.nextFloat();
		
		System.out.println("is TC Available");
		char tc=sc.next().charAt(0);
		
		System.out.println("Enter your PCM marks");
		int pcm=sc.nextInt();
		
		if(per>60)
		{
			if(tc=='y')
			{
				if(pcm>=50)
				{
					System.out.println("You are eligible for admission");
				}
				else
				{
					System.out.println("not eligible: pcm per less");
				}
			}
			else
			{
				System.out.println("not eligible: tc not available");
			}
			
		}
		else
		{
			System.out.println("not eligible: less percentage");
		}
		
		
		
		

	}

}
