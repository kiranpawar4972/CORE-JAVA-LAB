package com.abstractclass;

abstract class Paymentt
{
	abstract void send();
	abstract void checkBalence();
	abstract void statement();
	
	public void policy()
	{
		System.out.println("Policy is here");
	}
}

class Gpayy extends Paymentt
{
	@Override
	void send()
	{
		System.out.println("Gpay send money");	
	}
	@Override
	void checkBalence()
	{
		System.out.println("Gpay check Balance");
	}
	@Override
	void statement()
	{
		System.out.println("Gpay statement");
	}
	@Override
	public void policy()
	{
		System.out.println("Policy is Updated Gpayy");
	}
}

class Ppayy extends Paymentt
{
	@Override
	void send()
	{
		System.out.println("Ppayy send money");	
	}
	@Override
	void checkBalence()
	{
		System.out.println("Ppayy check Balance");
	}
	@Override
	void statement()
	{
		System.out.println("Ppayy statement");
	}
	@Override
	public void policy()
	{
		System.out.println("Policy is Updated Ppayy");
	}
}

class Ipayy extends Paymentt
{
	@Override
	void send()
	{
		System.out.println("Ipayy send money");	
	}
	@Override
	void checkBalence()
	{
		System.out.println("Ipayy check Balance");
	}
	@Override
	void statement()
	{
		System.out.println("Ipayy statement");
	}
	@Override
	public void policy()
	{
		System.out.println("Policy is Updated Ipayy");
	}
}
class ObjectFactory
{
	public static Paymentt getObject(int key)
	{
		if(key==1111)
		{
			return new Gpayy();
		}
		else if(key==2222)
		{
			return new Ppayy();
		}
		else if(key==3333)
		{
			return new Ipayy();
		}
		else
		{
			return null;
		}
	}
}
public class FactoryDesignPattern 
{
	public static void main(String[] args) 
	{
		Paymentt p=ObjectFactory.getObject(1111);
		
		if(p==null)
		{
			System.out.println("Wrong Key");
		}
		else
		{
			p.checkBalence();
			p.send();
			p.send();
			p.policy();
		}
	}

}
