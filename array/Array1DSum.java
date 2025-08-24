package com.array;

public class Array1DSum 
{

	public static void main(String[] args) 
	{
		// Sum of Array

		System.out.println("Sum of Array");
		int arr[] = { 1, 2, 3, 4, 5 };

		int sum = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			sum = sum + arr[i];
		}
		System.out.println(sum);
		

		
		// sum of Reverse array

		System.out.println("sum of Reverse array");
		int arr1[] = { 1, 2, 3, 4, 5 };

		int sum1 = 0;
		for (int i = arr1.length - 1; i >= 0; i--) 
		{
			sum1 = sum1 + arr[i];
		}
		System.out.println(sum1);
		

		
		// printing alternate number

		System.out.println("printing alternate number");

		int arr2[] = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i = i + 2) 
		{
			System.out.println(arr[i]);
		}
		
		

		// printing addtion of alternate number

		System.out.println("printing addtion of alternate number");

		int arr3[] = { 1, 2, 3, 4, 5 };

		int sum3 = 0;
		for (int i = 0; i < arr.length; i = i + 2) 
		{
			sum3 = sum3 + arr[i];
		}
		System.out.println(sum3);

	}

}
