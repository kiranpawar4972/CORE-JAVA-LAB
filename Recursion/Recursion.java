package recursion;

public class Recursion
{
		int count=1;		//instance variable
		public void test()
		{	
			System.out.println("Hello");
			
			if(count<=10)			// Base Case
			{
				count++;			//Recursive Call/Case
				test();	
			}
		}	
}
