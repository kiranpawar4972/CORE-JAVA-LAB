/*Lab_Abstraction_12_08_25 - Create an abstract class Vehicle with abstract 
methods start() and stop(). Implement two subclasses Car and Bike that 
provide their own implementation of these methods. Write a program to 
demonstrate calling these methods.*/

package com.lab;

// Abstract class
abstract class Vehicle 
{
	// Abstract methods
	abstract void start();

	abstract void stop();
}

// Car class
class Car extends Vehicle 
{
	@Override
	void start() 
	{
		System.out.println("Car started with a key.");
	}

	@Override
	void stop() 
	{
		System.out.println("Car stopped using brakes.");
	}
}

// Bike class
class Bike extends Vehicle 
{
	@Override
	void start() 
	{
		System.out.println("Bike started with self-start.");
	}

	@Override
	void stop() 
	{
		System.out.println("Bike stopped using disc brakes.");
	}
}

// Main class to demonstrate
public class VehicleAbstraction 
{
	public static void main(String[] args) 
	{
		// Create Car object
		Vehicle myCar = new Car();
		myCar.start();
		myCar.stop();

		System.out.println(); // Blank line

		// Create Bike object
		Vehicle myBike = new Bike();
		myBike.start();
		myBike.stop();
	}
}
