package com.staticKeyword;

class IndianEmployee
{
	private int id;
	private int age;
	private char gender;
	
	private static int countryCode=91;
	
	
	IndianEmployee(int id,int age,char gender)
	{
		this.id=id;
		this.age=age;
		this.gender=gender;
	}
	
	public void display()
	{
		System.out.println(id+ " || " +age+ " || " +gender+ " || " +countryCode);
	}
	
}

public class Employee 
{

	public static void main(String[] args) 
	{
		IndianEmployee ie1=new IndianEmployee(1,25,'m');
		IndianEmployee ie2=new IndianEmployee(2,26,'f');
		IndianEmployee ie3=new IndianEmployee(3,27,'m');
		IndianEmployee ie4=new IndianEmployee(4,23,'f');
		
		ie1.display();
		ie2.display();
		ie3.display();
		ie4.display();
		

	}

}
