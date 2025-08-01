package array;

import java.util.Scanner;

public class LaunchAcceptDisplay 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		// user input no of cities
		System.out.println("enter the no of cities: ");
		int cit=sc.nextInt();
		
		String city[]=new String[cit];
		
	//	String city[]=new String[5];  pre input
		
		for(int i=0;i<city.length;i++)
		{
			System.out.println("enter the city name: " + i+ ":" );
			city[i]=sc.next();
		}
		for(int i=0;i<=city.length;i++)
		{
			System.out.println("city are: " +i+ ":" +city[i]);
		}
		

	}

}
