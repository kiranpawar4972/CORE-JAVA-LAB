package com.array;

public class Array1D 
{

	public static void main(String[] args) 
	{
		
		int arr[]= {1,2,3,4,5};   // Initilisation
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.print("Array Iteration For Loop: \n");
		
		// array iteration
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.print("For each Loop: \n");
		
		// for each loop/ enhance for loop
		for(int k:arr)
		{
			System.out.println(k);
		}
		
		arr[0]=100;
		
		System.out.print("For each Loop after Updating Value: \n");
		
		for(int k:arr)
		{
			System.out.println(k);
		}
		

	}

}
