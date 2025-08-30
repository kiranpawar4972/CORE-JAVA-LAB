package com.string;

public class ImmutableString 
{
	public static void main(String[] args) 
	{
		
		// memory stored in heap area under string constant pool
		// duplicates are not allowed
		String k="kiran";
		System.out.println(k);
		
		String p="kiran";
		System.out.println(p);
		
		if(k==p)
			System.out.println("Reference are equal");
		else
			System.out.println("Reference are not equal");
		
		
		// memory stored in heap area
		//duplicates are allowed
		String a=new String("kiran");
		System.out.println(a);
		
		String b=new String("kiran");
		System.out.println(b);
		
		if(a==b)
			System.out.println("Reference are equal");
		else
			System.out.println("Reference are not equal");
		
		

	}

}
