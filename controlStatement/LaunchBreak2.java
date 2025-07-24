package controlStatement;

public class LaunchBreak2
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)				//11 11 11 11 11 1
			{
				if(j==3)
				{
					break;
				}
				System.out.println("Hello");
			}
			
		}
		System.out.println("Exit");
		

	}

}
