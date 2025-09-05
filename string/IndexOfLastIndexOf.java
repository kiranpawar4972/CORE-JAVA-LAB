package com.string;

public class IndexOfLastIndexOf 
{

	public static void main(String[] args) 
	{
		String s="KiranPawar@#";
		
		int n=s.indexOf("i");
		System.out.println(n);		//1
		
		System.out.println(s.indexOf("@"));	//10
		
		
		int k=s.lastIndexOf("a");
		System.out.println(k);		//8
		
		System.out.println(s.lastIndexOf("@"));	//10

	}

}
