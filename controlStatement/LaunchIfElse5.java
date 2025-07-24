package controlStatement;

import java.util.Scanner;

public class LaunchIfElse5 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your percentage");
		float perc=sc.nextFloat();
		
		System.out.println("do you have tc");
		char tc=sc.next().charAt(0);
		
		System.out.println("enter your pcm marks");
		int pcm=sc.nextInt();
		
		if(perc>60 && tc=='y' && pcm>50)
		{
			System.out.println("You are elgible for admission");
		}
		else
		{
			System.out.println("you are not eligible");
		}

	}

}
