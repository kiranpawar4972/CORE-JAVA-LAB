package com.inheritance;

class Animals
{
	public void sleep()
	{
		System.out.println("Animal needs sleep");
	}
	
	public void eat()
	{
		System.out.println("Animal needs food");
	}
}

//First level child
class Tigers extends Animals
{
	@Override
	public void eat()
	{
		System.out.println("Tiger needs non-veg food");
	}
	
	//Specialized method
	public void run()
	{
		System.out.println("tiger runs very fast");
	}
	
}

//Second level child
class BabyTiger extends Tigers
{
	public void play()
	{
		System.out.println("babytiger plays");
	}
}

//Main method
public class MultiLevelInheritance 
{
	public static void main(String[] args) 
	{
		BabyTiger b=new BabyTiger();
		b.sleep();
		b.eat();
		b.run();
		b.play();

	}

}
