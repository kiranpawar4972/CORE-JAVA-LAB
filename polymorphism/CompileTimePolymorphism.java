// compile time polymorphism/ early binding/ static binding/ method overloading
package com.polymorphism;

class Car
{
	public void m(int a)
	{
		System.out.println("logic 1");
	}
	public void m(float b)
	{
		System.out.println("logic 2");
	}
	public void m(boolean c)
	{
		System.out.println("logic 3");
	}
	public void m(int a,float b)
	{
		System.out.println("logic 4");
	}
	public void m(float a,int b)
	{
		System.out.println("logic 5");
	}
//	public int m(float a,int b)
//	{
//		System.out.println("logic 5");			CTE
//		return 100;
//	}
}

public class CompileTimePolymorphism 
{

	public static void main(String[] args) 
	{
		Car c=new Car();
		c.m(5);
		c.m(5.5f);
		c.m(false);
		c.m(56, 67.5f);
		c.m(4.3f, 67);

	}

}
