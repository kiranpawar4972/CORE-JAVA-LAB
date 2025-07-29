package recursion;

public class LaunchFactorial
{

	public static void main(String[] args) 
	{
		Factorial f=new Factorial();
		int num=6;
		int factorial=f.test(num);
		System.out.println("Factorial of " + num + " is: " +factorial );

	}

}
