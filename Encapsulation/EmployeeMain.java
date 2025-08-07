package com.encapsulation;

import java.util.Scanner;

public class EmployeeMain 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter Your EmpId: ");
		int empId=sc.nextInt();
		System.out.println("Please Enter Your Age: ");
		int age=sc.nextInt();
		System.out.println("Please Enter Your Address: ");
		String address=sc.next();
		System.out.println("Please Enter Your Designation: ");
		String designation=sc.next();
		System.out.println("Please Enter Your Salary: ");
		double salary=sc.nextDouble();
		
		
		EmployeePojoClass c=new EmployeePojoClass();
		c.setEmpId(empId);
		c.setAge(age);
		c.setAddress(address);
		c.setDesignation(designation);
		c.setSalary(salary);
		
		
		EmployeeDisplayData e=new EmployeeDisplayData();
		e.displayData(c);
		
		

	}

}
