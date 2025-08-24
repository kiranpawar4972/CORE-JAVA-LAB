package com.array;

import java.util.Scanner;

class Worker 
{
	private int id;
	private byte age;
	private float height;

	Worker(int id, byte age, float height) 
	{
		this.id = id;
		this.age = age;
		this.height = height;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public int getId() 
	{
		return id;
	}

	public void setAge(byte age) 
	{
		this.age = age;
	}

	public byte getAge() 
	{
		return age;
	}

	public void setheight(float height) 
	{
		this.height = height;
	}

	public float getHeight() 
	{
		return height;
	}

}

public class Array1DEmployee 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter How Many Workers You Want: ");
		int size = sc.nextInt();

		Worker arr[] = new Worker[size];

		for (int i=0; i<size; i++) 
		{
			System.out.println("Enter Worker Id");
			int id = sc.nextInt();
			System.out.println("Enter Worker Age");
			byte age = sc.nextByte();
			System.out.println("Enter Worker Height");
			float height = sc.nextFloat();

			Worker w = new Worker(id,age,height);
			arr[i] = w;

		}
		
		for(Worker k:arr)
		{
			System.out.println(k.getId());
			System.out.println(k.getAge());
			System.out.println(k.getHeight());
		}

	}

}
