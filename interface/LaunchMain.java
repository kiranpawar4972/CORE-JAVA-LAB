package com.interfacee;

public class LaunchMain 
{
	public static void test(MyInterface m)
	{
		m.speed();
		m.milage();
		m.engine();
		m.color();
	}
	
	public static void main(String[] args) 
	{
//		Bmw b=new Bmw();
//		test(b);
//		
//		Thar t=new Thar();
//		test(t);
//		
//		Curve c=new Curve();
//		test(c);
		
		
		test(new Bmw());
		test(new Thar());
		test(new Curve());
		
	}

}
