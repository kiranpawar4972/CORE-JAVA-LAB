package com.interfacee;

interface RoadBikes
{
	void run();
	void disBrake();
}

class Bikes implements RoadBikes
{
	@Override
	public void run() {
		System.out.println("Both Bikes Fastest speed is 80km");
		
	}

	@Override
	public void disBrake() {
		
		System.out.println("Both Bikes Have Disbrakes");
	}
	
	
	public void hero()
	{
		System.out.println("Spelender bike is Here");
	}
	
	public void Tvs()
	{
		System.out.println("Jupiter Bike is Here");
	}
	
}

public class LooseCoupling 
{
	public static void main(String[] args) 
	{
		//	Loose Coupling means You create a reference of a parent type 
		//	(superclass or interface) and hold an object of the child class.
		RoadBikes rb=new Bikes();
		rb.disBrake();
		rb.run();
		
		//Tight Coupling
		Bikes b=new Bikes();
		b.hero();
		b.Tvs();

	}

}
