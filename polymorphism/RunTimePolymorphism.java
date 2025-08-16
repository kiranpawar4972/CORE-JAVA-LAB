// runtime polymorphism/ dynamic binding/ late binding


package com.polymorphism;

class Tv
{
	public void color()
	{
		System.out.println("color");
	}
	public void type()
	{
		System.out.println("type");
	}
	public void ram()
	{
		System.out.println("ram");
	}
}

class Lg extends Tv
{
	public void color()
	{
		System.out.println("black");
	}
	public void type()
	{
		System.out.println("LED");
	}
	public void ram()
	{
		System.out.println("2gb");
	}
}
class Samsung extends Tv
{
	public void color()
	{
		System.out.println("blue");
	}
	public void type()
	{
		System.out.println("HDR");
	}
	public void ram()
	{
		System.out.println("4gb");
	}
}
class Tcl extends Tv
{
	public void color()
	{
		System.out.println("black");
	}
	public void type()
	{
		System.out.println("QLED");
	}
	public void ram()
	{
		System.out.println("3gb");
	}
}

class Electronic
{
	public void test(Tv t)
	{
		t.color();
		t.type();
		t.ram();
	}
	
}


public class RunTimePolymorphism 
{
	public static void main(String[] args) 
	{
		
		// Run time Polymorphisum
		
		Tv tv=new Tv();
		Lg l=new Lg();
		Samsung s=new Samsung();
		Tcl t=new Tcl();
		
		Electronic e=new Electronic();
		e.test(tv);
		e.test(l);
		e.test(s);
		e.test(t);
		
		
//		 Normal Call using object
//		Tv tv=new Tv();
//		tv.color();
//		tv.type();
//		tv.ram();
//		
//		Lg l=new Lg();
//		l.color();
//		l.type();
//		l.ram();
//		
//		Samsung s=new Samsung();
//		s.color();
//		s.type();
//		s.ram();
//		
//		Tcl t=new Tcl();
//		t.color();
//		t.type();
//		t.ram();
	
	}

}
