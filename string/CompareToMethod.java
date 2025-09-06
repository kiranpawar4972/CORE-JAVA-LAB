package com.string;

public class CompareToMethod 
{
	public static void main(String[] args) 
	{
		String s1="banana";
		String s2="banana";
		String s3="apple";
		String s4="pinapple";
		
		int l=s1.compareTo(s2);
		System.out.println(l);
		
		System.out.println(s1.compareTo(s3));
		
		System.out.println(s4.compareTo(s1));
		

//		How compareTo works
//
//		compareTo() compares character by character using Unicode values 
//		until it finds the first difference.
//
//		"pinapple" vs "banana"
//		First character: 'p' vs 'b'
//
//		 Unicode value of 'p' = 112
//		 Unicode value of 'b' = 98
//
//		Difference = 112 - 98 = 14
//
//		  Result
//
//		Since result is positive (14) → "pinapple" is lexicographically 
//		greater than "banana".
		
		
		
		
		
		
		
	}

}
