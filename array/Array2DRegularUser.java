package com.array;

import java.util.Scanner;

public class Array2DRegularUser 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter How many department you want");
		int dept=sc.nextInt();
		System.out.println("Enter How many Student you want");
		int stud=sc.nextInt();
		
		int arr[][]=new int[dept][stud];			// 4d|5s
		
		
		
		// taking input
		for(int i=0;i<arr.length;i++)				// 4
		{
			for(int j=0;j<arr[i].length;j++)		//5
			{
				System.out.println("for department"+i+"enter student"+j);
				arr[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		//display
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		

	}

}
