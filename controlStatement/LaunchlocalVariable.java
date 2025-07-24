package controlStatement;

public class LaunchlocalVariable 
{

	public static void main(String[] args) 
	{
		int a;	//Declaration
		a=100;	//Initialization
		int c;
		System.out.println(a);
		
		{
			int b;	//Declaration
			b=200;	//Initialization
			c=300;
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
		}
		
		// System.out.println(b);       Compile Time Error
		
			System.out.println(c);	// declaration on top 
	}
}
// local variable has no default value

