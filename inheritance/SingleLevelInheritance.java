package com.inheritance;

class Animal
{
	public void sleep()
	{
		System.out.println("Animal needs Sleep");
	}
	
	public void eat()
	{
		System.out.println("Animal needs food");
	}
}

class Tiger extends Animal
{
	//Override method
	@Override
	public void eat()
	{
		super.eat();	// calls Animal's eat() method
		System.out.println("tiger needs only nonveg food");
	}
	
	//specialized method
	public void run()
	{
		System.out.println("tiger runs very fast");
	}
}

public class SingleLevelInheritance 
{

	public static void main(String[] args) 
	{
		Tiger t=new Tiger();
		t.sleep();
		t.eat();
		t.run();

	}

}
