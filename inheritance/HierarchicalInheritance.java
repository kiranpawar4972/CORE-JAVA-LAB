package com.inheritance;

class AeroPlane
{
	final public void takeoff()  // can't Override method
	{
		System.out.println("Aeroplane is takeoff");
	}
	public void fly()
	{
		System.out.println("Aeroplane is flying");
	}
}

class CargoPlane extends AeroPlane
{
	@Override
	public void fly()
	{
		System.out.println("Cargoplane flies lower height");
	}
	//Specialized method
	public void carryGoods()
	{
		System.out.println("cargoplane carries goods");
	}
}

class PassengerPlane extends AeroPlane
{
	@Override
	public void fly()
	{
		System.out.println("Passenger plane flies at medium");
	}
	//Specialized method
	public void carryPassenger()
	{
		System.out.println("Passengerplane carries passenger");
	}
}

public class HierarchicalInheritance 
{
	public static void main(String[] args) 
	{
		CargoPlane cp=new CargoPlane();
		cp.takeoff();
		cp.fly();
		cp.carryGoods();
		
		PassengerPlane pp=new PassengerPlane();
		pp.takeoff();
		pp.fly();
		pp.carryPassenger();
		
		

	}

}
