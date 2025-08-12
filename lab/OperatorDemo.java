/*3. Lab_Operators_12_08_2025 - Write a program to accept two integers 
from the user and perform the following using operators:
A. Addition, subtraction, multiplication, division
B. Compare the two numbers using relational operators
C. Display the result of logical AND, OR, and NOT*/

package com.lab;

import java.util.Scanner;

public class OperatorDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		// Accept two integers
		System.out.print("Enter first integer: ");
		int num1 = sc.nextInt();

		System.out.print("Enter second integer: ");
		int num2 = sc.nextInt();

		// A. Arithmetic operations
		System.out.println("\n--- Arithmetic Operations ---");
		System.out.println("Addition: " + (num1 + num2));
		System.out.println("Subtraction: " + (num1 - num2));
		System.out.println("Multiplication: " + (num1 * num2));
		if (num2 != 0) 
		{
			System.out.println("Division: " + (num1 / num2));
		} 
		else 
		{
			System.out.println("Division: Cannot divide by zero");
		}

		// B. Relational operators
		System.out.println("\n--- Relational Operations ---");
		System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));
		System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));
		System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));
		System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
		System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));
		System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));

		// C. Logical operations
		System.out.println("\n--- Logical Operations ---");
		boolean condition1 = num1 > 0;
		boolean condition2 = num2 > 0;

		System.out.println("Logical AND: " + (condition1 && condition2));
		System.out.println("Logical OR: " + (condition1 || condition2));
		System.out.println("Logical NOT (num1 > 0): " + (!condition1));

		sc.close();
	}
}

//O/P: 
	
//	Enter first integer: 10
//	Enter second integer: 5

//	--- Arithmetic Operations ---
//	Addition: 15
//	Subtraction: 5
//	Multiplication: 50
//	Division: 2

//	--- Relational Operations ---
//	10 == 5 : false
//	10 != 5 : true
//	10 > 5 : true
//	10 < 5 : false
//	10 >= 5 : true
//	10 <= 5 : false

//	--- Logical Operations ---
//	Logical AND: true
//	Logical OR: true
//	Logical NOT (num1 > 0): false



