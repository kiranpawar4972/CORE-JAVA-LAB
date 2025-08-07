package com.constructor;

public class EmployeeMain 
{

	public static void main(String[] args) 
	{
		Employee e=new Employee(1,"kiran","javadevloper");
		e.displayData();
		
		e.setEmpName("Rohit");
		e.displayData();
		

	}

}
