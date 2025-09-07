package com.string;

public class ImmutableEqualsMethod 
{
	public static void main(String args[]) 
	{
		String s = "kiran";
		String k = "kiran";

		// check reference
		if (s == k)
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");

		// check values
		if (s.equals(k))
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");

		String a = new String("pune");
		String b = new String("pune");

		// check reference
		if (a == b)
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");

		// check values
		if (a.equals(b))
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");

	}

}
