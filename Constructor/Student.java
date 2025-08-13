package com.constructor;

public class Student 
{
	private int rollNo;
	private String name;
	private String sub;
	
	int a,b;
	
	//this() method is used for call current class constructor
	
	
	public Student()
	{
		this(1,"kira","pcmb");
		System.out.println("This is default constructor");
	}
	
	public Student(int rollNo,String name,String sub)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.sub=sub;
		System.out.println(+rollNo+ " || " +name+ " || " +sub);
	}
	
	public Student(int a,int b)
	{
		this();
		this.a=a;
		this.b=b;
		System.out.println(+a+ " || " +b);
	}
	
	
}
