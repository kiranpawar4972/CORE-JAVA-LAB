package methods;

public class Return 
{
	//No Parameter, Return
	public int retur()
		{
			return 10;
		}

	
	//No Parameter, Return
	//when we need not to send any value to the method but
	//we expect some return
	public int add()
	{
		int a=30,b=20;
		return a+b;
	}
	
	//Parameter, return
	//when your logic return something and
	//process on external data
	public int mul(int n1,int n2,int n3)
	{
		return n1*n2*n3;
	}
	
	
	
}
