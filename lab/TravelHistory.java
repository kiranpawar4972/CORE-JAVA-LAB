//Write a program to maintain a list of visited cities in travel 
//history using LinkedHashSet. The program should not allow duplicate 
//cities and should preserve the order of visits.

package com.lab;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class TravelHistory 
{
	public static void main(String[] args) 
	{
		// LinkedHashSet to store visited cities (no duplicates, order preserved)
		LinkedHashSet<String> visitedCities = new LinkedHashSet<>();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n--- Travel History Menu ---");
			System.out.println("1. Add a city");
			System.out.println("2. Show visited cities");
			System.out.println("3. Exit");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			sc.nextLine(); // consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter city name: ");
				String city = sc.nextLine();
				if (visitedCities.add(city)) {
					System.out.println(city + " added to travel history.");
				} else {
					System.out.println(city + " is already in travel history!");
				}
				break;

			case 2:
				System.out.println("\nVisited Cities (in order):");
				for (String c : visitedCities) {
					System.out.println("- " + c);
				}
				break;

			case 3:
				System.out.println("Exiting... Goodbye!");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice! Try again.");
			}
		}
	}
}

//OP:
//	--- Travel History Menu ---
//	1. Add a city
//	2. Show visited cities
//	3. Exit
//	Enter choice: 1
//	Enter city name: Paris
//	Paris added to travel history.
//
//	--- Travel History Menu ---
//	1. Add a city
//	2. Show visited cities
//	3. Exit
//	Enter choice: 1
//	Enter city name: London
//	London added to travel history.
//
//	--- Travel History Menu ---
//	1. Add a city
//	2. Show visited cities
//	3. Exit
//	Enter choice: 1
//	Enter city name: Paris
//	Paris is already in travel history!
//
//	--- Travel History Menu ---
//	1. Add a city
//	2. Show visited cities
//	3. Exit
//	Enter choice: 2
//	Visited Cities (in order):
//	- Paris
//	- London
