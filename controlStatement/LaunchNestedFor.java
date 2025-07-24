package controlStatement;

public class LaunchNestedFor 
{

	public static void main(String[] args) 
	{
		int m=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.println("Hello " +m);
				m++;
			}
		}

	}

}
