package com.interfacee;

interface MyInterfacee1
{
	public void num();
}

interface MyInterfacee2
{
	public void game();
}

class Logic
{
	public void logic()
	{
		System.out.println("Logic is Here");
	}
}

class Children extends Logic implements MyInterfacee1,MyInterfacee2
{
	@Override
	public void game() 
	{
		System.out.println("Child is Playing game");
	}

	@Override
	public void num() 
	{	
		System.out.println("Child thinking number");
	}
	
}

public class ExtendImplements 
{

	public static void main(String[] args) 
	{
		Children c=new Children();
		c.game();
		c.num();
		c.logic();

	}

}
