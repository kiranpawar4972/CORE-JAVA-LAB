package com.constructor;

class Car
{
	public Car(int a)
	{
		System.out.println("PCC");
	}
	
	public void speed()
	{
		System.out.println("speed 100km/h");
	}
	
	public void milage()
	{
		System.out.println("milage is 10km/l");
	}
	
	public void color()
	{
		System.out.println("color is red");
	}
}

	class Bmw extends Car
	{
		public Bmw()
		{
			super(10);
			System.out.println("CCC");
		}
	}

public class SuperKeyword 
{

	public static void main(String[] args) 
	{
		Bmw b=new Bmw();
		b.speed();
		b.milage();
		b.color();

	}

}
