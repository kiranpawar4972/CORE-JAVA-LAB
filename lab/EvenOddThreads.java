//Create two threads: one prints even numbers from 1 to 20, 
//and the other prints odd numbers from 1 to 20. Run them simultaneously.

package com.lab;

//Thread for printing even numbers
class EvenThread extends Thread 
{
	public void run() 
	{
		for (int i = 1; i <= 20; i++) 
		{
			if (i % 2 == 0) 
			{
				System.out.println("Even: " + i);
				try 
				{
					Thread.sleep(100); // small delay to simulate concurrency
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}

//Thread for printing odd numbers
class OddThread extends Thread 
{
	public void run() 
	{
		for (int i = 1; i <= 20; i++) 
		{
			if (i % 2 != 0) 
			{
				System.out.println("Odd: " + i);
				try 
				{
					Thread.sleep(100); // small delay
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}

//Main class
public class EvenOddThreads 
{
	public static void main(String[] args) 
	{
		EvenThread evenThread = new EvenThread();
		OddThread oddThread = new OddThread();

		// Start both threads
		evenThread.start();
		oddThread.start();
	}
}

//OP:
//Odd: 1
//Even: 2
//Odd: 3
//Even: 4
//Odd: 5
//Even: 6
//Odd: 7
//Even: 8
//Even: 10
//Odd: 9
//Even: 12
//Odd: 11
//Even: 14
//Odd: 13
//Even: 16
//Odd: 15
//Odd: 17
//Even: 18
//Odd: 19
//Even: 20
