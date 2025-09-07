package com.string;

public class EqualsIgnoreCaseMethod 
{

	public static void main(String[] args) 
	{
		String s1="KIRAN";
		
		String s2="kiraN";
		
		boolean res=s2.equalsIgnoreCase(s1);
		
		System.out.println(res);

	}

}
