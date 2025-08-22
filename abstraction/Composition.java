//Composition is a stronger form of association where:
//One class owns another class.
//The lifetime of the owned object depends on the owner.
//If the owner object is destroyed, the contained object is also destroyed.


package com.abstractclass;

class Car1 
{
	private int carNo;
	private int carModelNo;

	Car1(int carNo, int carModelNo) {
		this.carNo=carNo;
		this.carModelNo=carModelNo;
	}

	public void setCarNo(int carNo) {
		this.carNo=carNo;
	}

	public int getCarNo() {
		return carNo;
	}

	public void setCarModelNo(int carModelNo) {
		this.carModelNo=carModelNo;
	}

	public int getCarModelNo() {
		return carModelNo;
	}
}

class Employee1 {
	private int empNo;
	private int empId;
	private Car1 car;		

	public Employee1(int empNo, int empId) 
	{
		super();
		this.empNo= empNo;
		this.empId= empId;
		this.car=new Car1(1111,666666);		//Composition
	}

	public int getEmpNo() 
	{
		return empNo;
	}

	public int getEmpId() 
	{
		return empId;
	}

	public Car1 getCar() 
	{
		return car;
	}

	public void setEmpNo(int empNo) 
	{
		this.empNo=empNo;
	}

	public void setEmpId(int empId) 
	{
		this.empId=empId;
	}

	public void setCar(Car1 car) 
	{
		this.car=car;
	}

}

public class Composition 
{
	public static void main(String[] args) 
	{
		
		Employee1 e=new Employee1(1,06);
		
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpNo());
		System.out.println(e.getCar()); 	// it provides object address.
		
		System.out.println(e.getCar().getCarNo());
		System.out.println(e.getCar().getCarModelNo()); 
		
		
	
		
		
		
		
	}

}
