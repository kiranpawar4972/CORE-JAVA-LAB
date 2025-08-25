package com.array;

public class Array2DJagged {

	public static void main(String[] args) {
		int arr[][] = { 
				{ 1, 2, 3, 4, 5, 6, 7 }, 
				{ 1, 2, 3 }, 
				{ 8, 6, 4, 7 } 
				};
		
		// using for loop
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		//for each loop
		
		for(int err[]:arr)
		{
			for(int k:err)
			{
				System.out.print(k+ " ");
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
