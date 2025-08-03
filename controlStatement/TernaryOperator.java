package com.controlStatement;

public class TernaryOperator 
{

	public static void main(String[] args) 
	{
		
		int a=20;
		int b=10;
		int result=(a>b)?a:b;
		System.out.println(result);
		
		int c=50;
		int d=40;
		
		String res=(c>d)?"c is greater than d":"d is lesser than c";
		System.out.println(res);

	}

}
