//Java doesn’t support multiple inheritance with classes (to avoid the diamond 
// problem), but hybrid inheritance is possible using interfaces.

package com.inheritance;

//Parent class
class Animal1 
{
	public void eat() 
	{
		System.out.println("Animal eats food");
	}
}

//Child class (Single inheritance)
class Dog extends Animal1 
{
	public void bark() 
	{
		System.out.println("Dog barks");
	}
}

//Interface 1
interface Pet 
{
	void play();
}

//Interface 2
interface Guard 
{
	void guardHouse();
}

//Hybrid Inheritance: Class + Multiple Interfaces
class GermanShepherd extends Dog implements Pet, Guard 
{

	@Override
	public void play() 
	{
		System.out.println("German Shepherd plays with owner");
	}

	@Override
	public void guardHouse() 
	{
		System.out.println("German Shepherd guards the house");
	}
}

public class HybridInheritance 
{
	public static void main(String[] args) 
	{
		GermanShepherd gs = new GermanShepherd();

		// From Animal
		gs.eat();

		// From Dog
		gs.bark();

		// From Pet
		gs.play();

		// From Guard
		gs.guardHouse();
	}
}
