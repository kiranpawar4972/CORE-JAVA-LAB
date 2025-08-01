package array;

import java.util.Scanner;

public class LaunchEmployee 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Employee emp[]=new Employee[5];
		
		//Accept Data
		for(int i=0;i<emp.length;i++)
		{
			Employee e=new Employee();
			System.out.println("Enter EmpNo");
			e.empNo=sc.nextInt();
			System.out.println("Enter EmpName");
			e.empName=sc.next();
			
			emp[i]=e;
		}
		//Displaying Data
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("EmpNo: " + emp[i].empNo + "  EmpName: " +emp[i].empName );	
				
		}
		

	}

}
