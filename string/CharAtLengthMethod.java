package com.string;

public class CharAtLengthMethod 
{

	public static void main(String[] args) 
	{
		String s="kiran$**#";
		
		System.out.println(s.length());		// 9
		
		for(int i=0;i<s.length();i++)
		{
			System.out.print(i);		// 012345678
		}
		
		System.out.println();
		 
		System.out.println(s.charAt(2));		// r
		
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i));		// kiran$**#
		}
		
		System.out.println();
		System.out.println("********************************");
		
		String x=("54kiran453646pawar65");
		String filter="";
		
		for(int i=0;i<x.length();i++)
		{
			int n=x.charAt(i);
			
			if( (i>=65 && i<=90) || (i>=97 && i<=122) )
			{
				filter=filter+(char)n;
			}
			
		}
		System.out.println(filter);
		
	
		
	}

}
