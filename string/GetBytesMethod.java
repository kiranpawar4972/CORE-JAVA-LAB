package com.string;

public class GetBytesMethod 
{
	public static void main(String[] args) 
	{
		String s="azAZkiranpawar@#";
		
		byte b[]=s.getBytes();
		
		for(byte q:b)
		{
			System.out.print(q+ " ");
		}
		

		String s1="azAZ@#$kiranpawar@#";
		
		byte b1[]=s1.getBytes();
		
		for(byte q1:b1)
		{
			if((q1>=65 && q1<=90) || (q1>=97 && q1<=122))
			System.out.println((char)q1);
		}
		
	}
}
