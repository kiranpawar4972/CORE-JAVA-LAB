package controlStatement;

import java.util.Scanner;

public class LaunchIfElseLadder 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("please enter pincode");
		int pincode=sc.nextInt();
		
		if(pincode==411057)
		{
			System.out.println("wakad");
		}
		else if(pincode==411033)
		{
			System.out.println("thergaon");
		}
		else if(pincode==411044)
		{
			System.out.println("hinjawadi");
		}
		else
		{
			System.out.println("area not found");
		}
		
	
	}

}
