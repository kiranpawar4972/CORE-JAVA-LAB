//	Association is a relationship between two classes where one class uses or 
//	is aware of the other.
//	It’s a "has-a" relationship but without ownership — both objects can 
//	exist independently.


package com.abstractclass;

class Car 
{
	private int carNo;
	private int carModelNo;

	Car(int carNo, int carModelNo) {
		this.carNo=carNo;
		this.carModelNo=carModelNo;
	}

	public void setCarNo(int carNo) {
		this.carNo=carNo;
	}

	public int getCarNo() {
		return carNo;
	}

	public void setModelNo(int carModelNo) {
		this.carModelNo=carModelNo;
	}

	public int getCarModelNo() {
		return carModelNo;
	}
}

class Employee {
	private int empNo;
	private int empId;
	private Car car;		//Association

	public Employee(int empNo, int empId, Car car) 
	{
		super();
		this.empNo = empNo;
		this.empId = empId;
		this.car = car;
	}

	public int getEmpNo() 
	{
		return empNo;
	}

	public int getEmpId() 
	{
		return empId;
	}

	public Car getCar() 
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

	public void setCar(Car car) 
	{
		this.car=car;
	}

}

public class Association 
{
	public static void main(String[] args) 
	{
		Car c=new Car(1111,666666);
		
		System.out.println(c.getCarNo());
		System.out.println(c.getCarModelNo()); 
		
		System.out.println("************************************\n");
		
		Employee e=new Employee(1,06,c);
		
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpNo());
		System.out.println(e.getCar()); 	// it provides object address.
		
		System.out.println(e.getCar().getCarNo());
		System.out.println(e.getCar().getCarModelNo()); 
		
		
	
		
		
		
		
	}

}
