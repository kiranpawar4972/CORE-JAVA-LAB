package com.staticKeyword;

class Student
{
	int rollNo;
	static int id;
}


public class StaticVariable 
{

	public static void main(String[] args) 
	{
		Student s=new Student();
		System.out.println(s.rollNo);
		
	//object can access a static variable in Java, but again it’s not recommended
		System.out.println(s.id);
		
		
		// static way call
		System.out.println(Student.id);

	}

}
