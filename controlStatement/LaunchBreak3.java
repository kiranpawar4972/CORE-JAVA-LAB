package controlStatement;

public class LaunchBreak3 
{

	public static void main(String[] args)
	{
		loop1:
		for(int i=1;i<=5;i++)
		{
			loop2:
			for(int j=1;j<=5;j++)
			{
				if(j==3)
				{
					break loop1;
				}
				System.out.println("Hello");
			}
		}
		System.out.println("Exit");

	}

}
