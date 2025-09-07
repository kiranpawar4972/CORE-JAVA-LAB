package com.string;

public class ImmutableConcatMethod 
{

	public static void main(String[] args) 
	{
		String s="kiran";
		System.out.println(s);
		
		String k="kiran";
		System.out.println(k);
		
		String res=s.concat(k);
		System.out.println(res);		
		
		s=s.concat("pawar");
		System.out.println(s);
		
		if(s==k)
			System.out.println("Reference are equal");
		else
			System.out.println("Reference are not equal");
		

	}

}
