package com.controlStatement;

public class NumberSystem 
{

	public static void main(String[] args) 
	{
		int a=110;		//DECIMAL
		
		int b=0b110;	//BINARY	1 * 2^2   1 * 2^1   0 * 2^0 = 4 + 2 + 0 = 6
		int c=0110;		//OCTAL		1 * 8^2   1 * 8^1   0 * 8^0 = 64 + 8 + 0 = 72
		int d=0x110;	//HEXADECIMAL	1 * 16^2   1 * 16^1   0 * 16^0 = 256 + 16 + 0 = 272

		System.out.println(a);
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		
		
	}

}
