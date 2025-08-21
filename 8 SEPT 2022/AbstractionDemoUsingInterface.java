package oops;
interface ATM1
{
	void withdraw(double amt);// abstract method
}

class IOBATM implements ATM1
{
	public void withdraw(double amt)
	{
		System.out.println("In IOBATM m/c, the amount withdrawn is "+amt);
	}
}

class ICICIATM implements ATM1
{
	public void withdraw(double amt)
	{
		System.out.println("In ICICIATM m/c, the amount withdrawn is "+amt);
	}
}

public class AbstractionDemoUsingInterface {

	public static void main(String[] args) {
		ATM1 user1 = new IOBATM();
		user1.withdraw(1500);
		
		ATM1 user2 = new ICICIATM();
		user2.withdraw(3000);
		
	}

}
