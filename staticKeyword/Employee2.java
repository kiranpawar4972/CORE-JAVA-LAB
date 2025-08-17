package com.staticKeyword;

import java.util.Scanner;

class IndiEmployee
{
	private int id;
	private int age;
	private char gender;
	
	private static int countryCode;
	
	static
	{
		System.out.println("Please enter your countrycode");
		Scanner sc =new Scanner(System.in);
		countryCode=sc.nextInt();
	}
	
	IndiEmployee(int id,int age,char gender)
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

public class Employee2 
{

	public static void main(String[] args) 
	{
		IndiEmployee ie1=new IndiEmployee(1,25,'m');
		IndiEmployee ie2=new IndiEmployee(2,26,'f');
		IndiEmployee ie3=new IndiEmployee(3,27,'m');
		IndiEmployee ie4=new IndiEmployee(4,23,'f');
		
		ie1.display();
		ie2.display();
		ie3.display();
		ie4.display();
		

	}

}
