package controlStatement;

public class LaunchContinue2 
{

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==3)
				{
					continue;
				}
				System.out.println("hello");	
			}
		}
		System.out.println("exit");

	}

}
