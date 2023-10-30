package com.operators;

import java.util.Scanner;

public class NumberTypeChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = scanner.nextInt();

		scanner.close();

		if ((number & 1) == 0) {
			System.out.println("Given number is even.");
		} else {
			System.out.println("Given number is odd.");
		}

		if (number > 0) {
			System.out.println("Given number is positive.");
		} else if (number < 0) {
			System.out.println("Given number is negative.");
		} else {
			System.out.println("Given number is zero.");
		}
	}

}
