/*Lab_Polymorphism_12-08_2025 - Create a parent class Shape with 
a method calculateArea(). Implement subclasses Circle and Rectangle 
that override this method to calculate the respective areas. 
Demonstrate runtime polymorphism by using a Shape reference to 
call the method for both objects.*/

package com.lab;

//Parent class
class Shape 
{
	double calculateArea() 
	{
		System.out.println("Area calculation for shape is undefined.");
		return 0;
	}
}

//Circle subclass
class Circle extends Shape 
{
	double radius;

	Circle(double radius) 
	{
		this.radius = radius;
	}

	@Override
	double calculateArea() 
	{
		return Math.PI * radius * radius;
	}
}

//Rectangle subclass
class Rectangle extends Shape 
{
	double length, width;

	Rectangle(double length, double width) 
	{
		this.length = length;
		this.width = width;
	}

	@Override
	double calculateArea() 
	{
		return length * width;
	}
}

//Main class to demonstrate runtime polymorphism
public class ShapePolymorphism 
{
	public static void main(String[] args) 
	{
		Shape shape; // Reference of parent type

		// Pointing to a Circle object
		shape = new Circle(5);
		System.out.println("Area of Circle: " + shape.calculateArea());

		// Pointing to a Rectangle object
		shape = new Rectangle(4, 6);
		System.out.println("Area of Rectangle: " + shape.calculateArea());
	}
}


//O/P: 

//	Area of Circle: 78.53981633974483
//	Area of Rectangle: 24.0




