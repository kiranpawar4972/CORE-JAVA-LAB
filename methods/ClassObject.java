package com.methods;

public class ClassObject 
{
	public void sum()
	{
		int a=10;
		int b=20;
		
		System.out.println(a+b);
	}
	
	public static void main(String[] args) 
	{
		ClassObject c=new ClassObject();
		//we have created object of ClassObject class
		//c: is a reference variable
		//ClassObject is a object
		
		c.sum();

	}

}
