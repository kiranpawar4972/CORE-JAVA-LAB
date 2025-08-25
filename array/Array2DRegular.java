package com.array;

public class Array2DRegular 
{
	public static void main(String[] args) 
	{
		int arr[][]= {
						{1,2,3,4},
						{5,6,7,8},
						{9,0,1,2}
					};
		
		
		// using for each Loop
		for(int err[]:arr)
		{
			for(int e:err)
			{
				System.out.print(e+" ");
			}
			System.out.println();
		}
		
		
		// using for Loop
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println( );
		}
		

	}

}
