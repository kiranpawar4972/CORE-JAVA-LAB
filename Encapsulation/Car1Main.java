package com.encapsulation;

import java.util.Scanner;

public class Car1Main
{

	public static void main(String[] args) 
	{
		Car1 c=new Car1();
		
//		int rollNo=20;
//		int age=24;
//		char gender='m';
//		boolean pc=false;
//		float pcmPer=05.67f;
		
//		c.test(rollNo, age, gender, pc, pcmPer);
		
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
		
		
		c.test(rollNo, age, gender, pc, pcmPer);
		
		

	}

}
