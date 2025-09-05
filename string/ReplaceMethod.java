package com.string;

public class ReplaceMethod 
{
	public static void main(String[] args) 
	{
		String s="kirannnnpawar@#";
		
		String a=s.replace("n","q");
		System.out.println(a);				//kiraqqqqpawar@#
		
		System.out.println(s.replace("k","c"));	//cirannnnpawar@#
		
		String s1="kiran kiran kiran p p p pawar op";
		
		String s2=s1.replace("p","o");		//kiran kiran kiran o o o oawar oo
		System.out.println(s2);
		
		System.out.println(s2.replace("kiran","prem"));	//prem prem prem o o o oawar oo

	}

}
