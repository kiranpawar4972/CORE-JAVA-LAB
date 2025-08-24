package com.array;

import java.util.Scanner;

class Worker1 
{
	 int id;
	 byte age;
	 float height;

}

public class Array1DEmployee2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter How Many Workers You Want: ");
		int size = sc.nextInt();

		Worker1 arr[] = new Worker1[size];

		// Inserting
		for (int i=0; i<size; i++) 
		{
			Worker1 w = new Worker1(); 
			
			System.out.println("Enter Worker Id");
			w.id = sc.nextInt();
			System.out.println("Enter Worker Age");
			w.age = sc.nextByte();
			System.out.println("Enter Worker Height");
			w.height = sc.nextFloat();

			arr[i] = w;

		}
		
		//Displaying For each loop
		for(Worker1 k:arr)
		{
			System.out.println(k.id);
			System.out.println(k.age);
			System.out.println(k.height);
		}
		
		//Displaying for loop
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].id);
			System.out.println(arr[i].age);
			System.out.println(arr[i].height);
		}

	}

}
