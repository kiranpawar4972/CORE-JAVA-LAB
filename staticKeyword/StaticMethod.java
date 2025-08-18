package com.staticKeyword;

class Employe
{
	private static int commonResult;
	private int result;
	
	public void objectSpecificLogic(int a,int b)
	{
		result=a*b;
	}
	public void displayObjectSpecificLogic()
	{
		System.out.println("Result is: "+result);	
	}
	
	
	// Static Method is used for common logic 
	public static void commonLogic(int a,int b)
	{
		commonResult=a+b;
	}
	//normal method can hold static variable
	public void displayCommonLogic()
	{
		System.out.println("CommonResult is: "+commonResult);
	}
	
}

public class StaticMethod 
{
	public static void main(String[] args) 
	{
		Employe e1=new Employe();
		e1.objectSpecificLogic(10,20);
		e1.displayObjectSpecificLogic();	//200
		
		Employe e2=new Employe();
		e2.displayObjectSpecificLogic();	//0
	
		Employe.commonLogic(10,20);
		
		
		// object can call a static method, but it’s generally not recommended.
		e1.displayCommonLogic();			//30
		e2.displayCommonLogic();			//30
	
	}

}
