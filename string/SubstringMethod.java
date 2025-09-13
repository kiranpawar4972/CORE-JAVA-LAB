package com.string;

public class SubstringMethod {

	public static void main(String[] args) {
		
		String s="Kiran Pawar";
		
		System.out.println(s.substring(0)); // Kiran Pawar
		
		System.out.println(s.substring(3));	// an Pawar
		
		System.out.println(s.substring(5));	//  Pawar
		
		System.out.println(s.substring(5,10));	//  Pawa
		
		System.out.println(s.substring(2,3));	// r
		
		String st=s.substring(6,7);
		System.out.println(st);		//p

	}

}
