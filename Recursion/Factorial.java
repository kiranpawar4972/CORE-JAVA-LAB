package recursion;

public class Factorial 
{
		
	public int test(int num)
	{
		if(num==1 ||num==0)
			return 1;
		
		return num*test(num-1);
	}
	

}
