package com.encapsulation;

import java.util.Scanner;

public class CarEmployeeMain2 
{

		public static void main(String[] args) 
		{
			Car2 c=new Car2();
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter your RollNo");
			int rollNo=sc.nextInt();
			System.out.println("Enter your Age");
			int age=sc.nextInt();
			System.out.println("Enter your Gender");
			char gender=sc.next().charAt(0);
			System.out.println("Enter your pc");
			boolean pc=sc.nextBoolean();
			System.out.println("Enter your pcmPer");
			float pcmPer=sc.nextFloat();
			
			CarEmployee2 emp=new CarEmployee2();
			
			emp.rollNo=rollNo;
			emp.age=age;
			emp.gender=gender;
			emp.pc=pc;
			emp.pcmPer=pcmPer;
			
			c.test(emp);
			
			

		}

	}

