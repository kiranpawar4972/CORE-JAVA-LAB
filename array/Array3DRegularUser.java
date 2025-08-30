package com.array;

import java.util.Scanner;

public class Array3DRegularUser 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int clg,dept,stud;
		
		System.out.println("Enter no of colleges");
		clg=sc.nextInt();
		System.out.println("Enter no of department");
		dept=sc.nextInt();
		System.out.println("Enter no of student");
		stud=sc.nextInt();
		
		int arr[][][]=new int[clg][dept][stud];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("for departments"+j+"enter student"+k);
					arr[i][j][k]=sc.nextInt();
				}
				System.out.println();
			}
			System.out.println();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.print(arr[i][j][k] +" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
