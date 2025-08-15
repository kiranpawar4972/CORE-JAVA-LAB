package com.inheritance;

class Bike extends Object
{
	
	public Bike()
	{
		super();
		System.out.println("Parent class constructor");
	}
	
	public int price=90000;
	
	public void bikeName()
	{
		System.out.println("Parent Class : Splender Bike");
	}
	
}

class RoyalEnfield extends Bike
{
	public RoyalEnfield()
	{
		super();
		System.out.println("Child class constructor");
	}
	
	int price=290000;
	
	public void hunter()
	{
		int price=250000;
		System.out.println("Child Class: Hunter Bike");
		System.out.println(price);			//250000
		System.out.println(this.price);		//290000
		System.out.println(super.price);	//90000
		
		super.bikeName();					// called parent class method
	}
}

public class ThisSuperKeyword 
{
	public static void main(String[] args)
	{
		RoyalEnfield re=new RoyalEnfield();
		re.hunter();
	}

}
