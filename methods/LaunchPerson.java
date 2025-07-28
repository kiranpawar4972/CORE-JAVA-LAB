package methods;

import java.util.Scanner;

public class LaunchPerson 
{
	Scanner sc=new Scanner(System.in);
	
	String name="";
	int age=0;
	String email="null";
	
	public void acceptInfo()
	{
		System.out.print("Enter Your Name: ");
		name=sc.next();
		System.out.print("Enter Your age: ");
		age=sc.nextInt();
		System.out.print("Enter Your Email: ");
		email=sc.next();		
	}
	
	public void displayInfo()
	{
		System.out.println("Name is: " +name);
		System.out.println(name+ "age is: " +age);
		System.out.println(name+ "email id is: " +email);
	}
	
	public void verifyEmail()
	{
		if(email.contains("@"))
			System.out.println("Veified");
		else
			System.out.println("Not Verified");
		
//		String msg=(email.contains("@"))? "valid": "Invalid";
//		System.out.println(msg);
		
	}
	
	public static void main(String[] args) 
	{
		LaunchPerson l=new LaunchPerson();
		l.acceptInfo();
		l.displayInfo();
		l.verifyEmail();

	}

}
