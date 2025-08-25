package com.array;

import java.util.Scanner;

public class Array1DUserInput 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter How Many Employees You Want");	//3
		int size=sc.nextInt();
		
		int arr[]=new int[size];	// 0 1 2
		
		//insert
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Employee Id");
			arr[i]=sc.nextInt();	
		}
		
		//printing
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
