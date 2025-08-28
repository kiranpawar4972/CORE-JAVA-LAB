package com.array;

import java.util.Scanner;

public class Array3DJaggedUser 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter how many colleges you want");
		int clg=sc.nextInt();
		
		int arr[][][]=new int[clg][][];
		
		for(int i=0;i<clg;i++)
		{
			System.out.println("enter how many departments you want");
			int dept=sc.nextInt();
			arr[i]=new int[dept][];
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("enter how many students you want");
				int stud=sc.nextInt();
				arr[i][j]=new int[stud];
			}
		}
		
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
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	
	}

}
