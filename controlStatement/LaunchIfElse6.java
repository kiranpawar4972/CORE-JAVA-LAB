package controlStatement;

public class LaunchIfElse6 
{

	public static void main(String[] args) 
	{
		int num=100;
		if(num%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd number");
		}
		
		System.out.println("\n");
		
		String res=(num%2==0)?"Even Number":"Odd Number";
		System.out.println(res);

	}

}
