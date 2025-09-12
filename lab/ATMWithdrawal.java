//Write a program to simulate an ATM withdrawal. 
//If the withdrawal amount is greater than the available balance, 
//throw and handle InsufficientBalanceException. Otherwise, show the 
//remaining balance.

package com.lab;

//Custom Exception Class
class InsufficientBalanceException extends Exception 
{
	public InsufficientBalanceException(String message) 
	{
		super(message);
	}
}

//ATM Simulation Class
public class ATMWithdrawal 
{
	private double balance;

	// Constructor
	public ATMWithdrawal(double balance) 
	{
		this.balance = balance;
	}

	// Withdraw method
	public void withdraw(double amount) throws InsufficientBalanceException 
	{
		if (amount > balance) 
		{
			throw new InsufficientBalanceException("Error: Insufficient balance. Available balance = " + balance);
		} 
		else 
		{
			balance -= amount;
			System.out.println("Withdrawal successful! Amount withdrawn: " + amount);
			System.out.println("Remaining balance: " + balance);
		}
	}

	// Main Method
	public static void main(String[] args) 
	{
		ATMWithdrawal atm = new ATMWithdrawal(5000); // Initial balance = 5000

		try 
		{
			atm.withdraw(2000); // valid withdrawal
			atm.withdraw(4000); // exceeds balance -> exception
		} catch (InsufficientBalanceException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}

//OP:
//Withdrawal successful! Amount withdrawn: 2000.0
//Remaining balance: 3000.0
//Error: Insufficient balance. Available balance = 3000.0









