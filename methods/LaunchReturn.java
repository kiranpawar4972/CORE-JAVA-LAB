package methods;

public class LaunchReturn 
{

	public static void main(String[] args) 
	{
		System.out.println("Main starts Here");
		Return r=new Return();
	//	r.retur();						 no output
		System.out.println(r.retur());	//10
		
		System.out.println("\n");
		
		int addtion=r.add();
		System.out.println("addtion is: " +addtion);  //50
		
		System.out.println("\n");
		
	//	r.mul(3, 3, 3);
		System.out.println("Multiplication is: "+ r.mul(3, 3, 3));
		
		System.out.println("Main Exit");

	}

}
