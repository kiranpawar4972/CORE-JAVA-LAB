package controlStatement;

import java.util.Scanner;

public class LaunchNestedIf2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your pincode");
		int pincode = sc.nextInt();

		if (pincode == 411057) {
			System.out.println("Wakad");
		} else {
			if (pincode == 411033) {
				System.out.println("thergaon");
			} else {
				if (pincode == 411044) {
					System.out.println("hinjawadi");
				} else {
					System.out.println("area not found");
				}
			}
		}

	}

}
