package com.encapsulation;

public class EmployeeDisplayData 
{
	public void displayData(EmployeePojoClass emp)
	{
		System.out.println("Employee Id is: "+emp.getEmpId());
		System.out.println("Employee Age is: "+emp.getAge());
		System.out.println("Employee Address is: "+emp.getAddress());
		System.out.println("Employee Designation is: "+emp.getDesiganation());
		System.out.println("Employee Salary is: "+emp.getSalary());
		
		emp.setSalary(60000);
		
		System.out.println("Employee Id is: "+emp.getEmpId());
		System.out.println("Employee Age is: "+emp.getAge());
		System.out.println("Employee Address is: "+emp.getAddress());
		System.out.println("Employee Designation is: "+emp.getDesiganation());
		System.out.println("Employee Salary is: "+emp.getSalary());
			
	}
	

}
