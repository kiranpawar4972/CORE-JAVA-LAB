package com.methods;





public class Type1 
{
	private int modelNo=4444;
	private int carNo=4971;
	
	public void run() 
	{
		System.out.println("car is running " + modelNo + " || " +carNo );
	}
	
	public void drift()
	{
		System.out.println("car is drifting " + modelNo + " || " +carNo );
	}
	
	public void autoMode()
	{
		System.out.println("car is on automode " + modelNo + " || " +carNo );
	}
	
	public static void main(String[] args) 
	{
		Type1 t=new Type1();
		
		//you can hold object inside a variable
		
		t.run();
		t.drift();
		t.autoMode();
	}

}
