package com.constructor;

public class ThisKeyword 
{
	int a=1000;
	public void test()
	{
		int a=100;
		
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args) 
	{
		ThisKeyword tk=new ThisKeyword();
		tk.test();

	}

}
