package controlStatement;

public class LaunchBreak 
{

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			if(i==3)
			{
				break;
			}
			System.out.println("Hello");
		}
		System.out.println("Exit");

	}

}
