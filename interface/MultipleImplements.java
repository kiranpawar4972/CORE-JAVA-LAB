package com.interfacee;

interface MyInterface1
{
	public void demo();
}
interface MyInterface2
{
	// public int demo();   CTE   method overloading checks method name and parameter not datatype
	
	public int demo(int a);
}

class Child implements MyInterface1,MyInterface2
{
	public void demo()
	{
		System.out.println("demo class");
	}
	
	public int demo(int a)
	{
		return 0;
	}
	
}

public class MultipleImplements 
{

	public static void main(String[] args) 
	{
		Child c=new Child();
		c.demo();
		c.demo(10);

	}

}
