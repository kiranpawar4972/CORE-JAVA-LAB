package com.string;
public class ToCharArrayMethod
{
	public static void main(String[] args) 
	{
		String s="kiran123@#pawar";
		
		char c[]=s.toCharArray();
		
		//System.out.println(c);	//kiran123@#pawar
		
		for(char elm:c)
		{
			System.out.print(elm);		//kiran123@#pawar
		}
		
	}

}
