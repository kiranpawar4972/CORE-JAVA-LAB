package com.string;

public class ContainsMethod 
{

	public static void main(String[] args) 
	{
		String s="KiranPawar";
		
		System.out.println(s.contains("an")); //true
		
		System.out.println(s.contains("a"));	//true
		
		boolean b=s.contains("z");
		System.out.println(b);		//false

	}

}
