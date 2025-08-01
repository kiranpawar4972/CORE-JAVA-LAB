package array;

public class LaunchAvg 
{

	public static void main(String[] args) 
	{
		int num[]= {10,20,30,40,50,60,70};
		int total=0;
		float avg;
		for (int i=0;i<=6;i++)
		{
			System.out.println("element of "  + i + ":"+ num[i]);
			total=total+num[i];
		}
			avg=total/7.0f;
			System.out.println("average is: "+avg);
	}

}
