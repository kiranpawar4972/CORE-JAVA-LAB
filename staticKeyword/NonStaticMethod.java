package com.staticKeyword;

class Students
{
	private int result=100;
	private static int commonResult=1000;
	
	
	//object specific method can access common data
	public void test() 
	{
		System.out.println("Result is: "+result);
		System.out.println("CommonResult is: "+commonResult);
		
		// you can access static from non static 
		demo();
	}
	
	// in common method can not access object data
	public static void demo()
	{
		System.out.println("CommonResult is: "+commonResult);
		
		// also you cannot use this keyword
		// System.out.println(result);  				CTE
		// you cannot call non static method  test();
			
	}
	
	
}


public class NonStaticMethod 
{
	public static void main(String[] args) 
	{
		Students s=new Students();
		s.test();
		
		//Students.demo();

	}

}
