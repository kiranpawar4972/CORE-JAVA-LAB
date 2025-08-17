package com.staticKeyword;

import java.util.Scanner;

class IndEmployee {
    private int id;
    private int age;
    private char gender;
    private static int countryCode;

    static Scanner sc = new Scanner(System.in);

    static {
        System.out.println("Please enter your countrycode");
        countryCode = sc.nextInt();
    }

    public IndEmployee() { }

    IndEmployee(int id, int age, char gender) {
        this.id = id;
        this.age = age;
        this.gender = gender;
    }

//    public int getId() {
//		return id;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public char getGender() {
//		return gender;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public void setGender(char gender) {
//		this.gender = gender;
//	}
	
	public void inputData() 
    {
		System.out.println("Enter number of Employees: ");
        int no = sc.nextInt();

        IndEmployee emp[] = new IndEmployee[no];

        // Loop for input
        for (int i=0; i<no; i++) 
        {
        	System.out.println("employee "+(i+1)+ " is");
        	
        	 System.out.println("enter your id ");
             id = sc.nextInt();

             System.out.println("enter your age ");
             age = sc.nextInt();

             System.out.println("enter your gender ");
             gender = sc.next().charAt(0);
             
             IndEmployee e=new IndEmployee(id,age,gender);
             
            emp[i]=e;
        }
		
        for (IndEmployee em : emp) {
            em.display();
        }
       
    }

    public void display() {
        System.out.println(id + " || " + age + " || " + gender + " || " + countryCode);
    }
}

public class Employee3 
{
    public static void main(String[] args) 
    {
    	IndEmployee i=new IndEmployee();
    	i.inputData();
     
    }
}
