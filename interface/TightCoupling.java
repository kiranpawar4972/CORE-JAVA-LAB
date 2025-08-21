package com.interfacee;

class Car
{
	public void suzuki()
	{
		System.out.println("Baleno Car is Here");
	}
	
	public void mahindra()
	{
		System.out.println("Thar Car is Here");
	}
	
}

public class TightCoupling 
{
	public static void main(String[] args) 
	{
		// 	if you make an object with its own concrete class type instead 
		//	of using a parent class or interface reference, you are creating 
		//	tight coupling. 
		
		
		Car c=new Car();
		c.suzuki();
		c.mahindra();

	}

}
