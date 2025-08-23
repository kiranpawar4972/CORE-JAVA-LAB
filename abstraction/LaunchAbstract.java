package com.abstractclass;

abstract class Teacher
{
	abstract void read();
	abstract void write();
	
	public void book()
	{
		System.out.println("Take a book from student");
	}
}

class Student1 extends Teacher 
{
	@Override
	public void book()
	{
		System.out.println("Student1 give book to teacher");
	}

	@Override
	public void read() 
	{
		System.out.println("Student1 is Reading a Book");
		
	}

	@Override
	public void write() 
	{
		System.out.println("Student1 is Writing a Book");
		
	}
}

class Student2 extends Teacher 
{
	@Override
	public void book()
	{
		System.out.println("Student2 give book to teacher");
	}

	@Override
	public void read() 
	{
		System.out.println("Student2 is Reading a Book");
		
	}

	@Override
	public void write() 
	{
		System.out.println("Student2 is Writing a Book");
		
	}
}

public class LaunchAbstract 
{
	public static void main(String[] args) 
	{	
		// for student1
		Teacher t1=new Student1();
		t1.book();	
		t1.read();
		t1.write();
		
		// for student2
		Teacher t2=new Student2();
		t2.book();
		t1.read();
		t1.write();
		
	}

}
