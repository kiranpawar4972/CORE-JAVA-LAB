package controlStatement;

import java.util.Scanner;

public class LaunchScanner2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter num1: "); // 10
		int n1 = s.nextInt();

		System.out.print("Enter num2: "); // 16
		int n2 = s.nextInt();

		if (n1 < n2) 
		{
			int sum = 0;
			for (int i = n1; i <= n2; i++) 
			{
				sum = sum + i;
				System.out.print(i);
				if(i!=n2)
					System.out.print("+");
			}

			System.out.print("=" +sum);
		} 
		else
		{
			System.out.println("n1 must be less than n2");
		}

	}

}
