package com.string;

public class MutableString 
{

	public static void main(String[] args) 
	{
		
		StringBuffer sbf=new StringBuffer("kiranpawar");
		sbf.append("kbp");
		System.out.println(sbf);
		sbf.reverse();
		System.out.println(sbf);
		sbf.insert(0,"prem");
		System.out.println(sbf);
		sbf.delete(4,16);
		System.out.println(sbf);
		
		System.out.println("\n");
		
		StringBuilder sbl=new StringBuilder("kiranpawar");
		sbl.append("kbp");
		System.out.println(sbl);
		sbl.reverse();
		System.out.println(sbl);
		sbl.insert(0,"prem");
		System.out.println(sbl);
		sbl.delete(4,16);
		System.out.println(sbl);
		
		

	}

}
