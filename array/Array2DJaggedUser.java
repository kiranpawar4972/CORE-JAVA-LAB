package com.array;

import java.util.Scanner;

public class Array2DJaggedUser 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter how many dept you want");
		int dept=sc.nextInt();			//3
		
		int arr[][]=new int[dept][];
		
//		arr[0]=new int[5];
//		arr[1]=new int[4];
//		arr[2]=new int[2];
		
		for(int i=0;i<dept;i++)
		{
			System.out.println("enter how many students youwant for"+i+"department");
			int stud=sc.nextInt();
			arr[i]=new int[stud];
		}
		
		// for loop for input
		
		for(int i=0;i<dept;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("please enter"+i+"department for" +j+ "student");
				arr[i][j]=sc.nextInt();
			}
			
		}
			
		//for loop for printing
		for(int i=0;i<dept;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
