package com.inheritance;

public class Bmw1 extends Car1
{
	@Override
	public void speed()
	{
		System.out.println("bmw speed is 120km/h");
	}
		
	//Specialized method
	public void automode()
	{
		System.out.println("bmw car has driving automode");
	}
	

}
