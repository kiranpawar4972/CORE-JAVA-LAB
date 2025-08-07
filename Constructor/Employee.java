package com.constructor;

public class Employee 
{
	private int empId;
	private String empName;
	private String designation;
	
	public Employee(int empId,String empName,String designation)
	{
		this.empId=empId;
		this.empName=empName;
		this.designation=designation;
	}
	
	public void displayData()
	{
		System.out.println(empId+ " || " +empName+ " || " +designation);
	}
	
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}
	
	public void setEmpName(String empName)
	{
		this.empName=empName;
	}
	
	public void setDesignation(String designation)
	{
		this.designation=designation;
	}
	

}
