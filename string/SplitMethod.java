package com.string;

public class SplitMethod 
{

	public static void main(String[] args) 
	{
		String s="this is my car";
		
		System.out.println(s);
		System.out.println();		// new line
		
		String sp[]=s.split("i");
		
		for(String elm:sp)
		{
			System.out.println(elm);
		}
		System.out.println();		// new line
		
		String sp1[]=s.split(" ");
		
		for(String elm:sp1)
		{
			System.out.print(elm);
		}
		System.out.println();		// new line

	}

}
