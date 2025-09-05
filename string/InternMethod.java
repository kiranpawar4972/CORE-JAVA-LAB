package com.string;

public class InternMethod 
{

	// Convert a non-constant (heap string) into a constant (pooled string in SCP).
	public static void main(String[] args) 
	{
		String s="kiran"; // string constant pool
		
		String k=new String("kiran"); // non constant pool
		
		System.out.println(s==k);	//false
		
		String a=k.intern();
		System.out.println(a);
		
		System.out.println(s==a);	//true
		
		
	}

}
