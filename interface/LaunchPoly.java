package com.interfacee;

interface MyInterfacee
{
	void read();
	void write();
}

class Teacher
{
	public void book()
	{
		System.out.println("Take a book from student");
	}
}

class Student1 extends Teacher implements MyInterfacee
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

class Student2 extends Teacher implements MyInterfacee
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

public class LaunchPoly 
{
	public static void main(String[] args) 
	{
//		Teacher t;
//		t=new Student1();
//		t.Teacher();
//		t.read();		// CTE We cannot achived polymorphism here
//		t.write();		// we solve this problem using abstraction
		
		// for student1
		Teacher t1=new Student1();
		t1.book();
		MyInterfacee mi1=new Student1();
		mi1.read();
		mi1.write();
		
		// for student2
		Teacher t2=new Student2();
		t2.book();
		MyInterfacee mi2=(MyInterfacee) t2;		// casting
		mi2.read();
		mi2.write();
		
	}

}
