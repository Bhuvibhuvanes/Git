package com.operators;

import java.util.Scanner;

public class ParityChecker {
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

		// using ternary operator
		String out = (number & 1) == 0 ? "Even" : "Odd";
		System.out.println(out);

		// using multiple and divide operator
		int a = number / 2;
		String puts = (a * 2 == number) ? "Even" : "Odd";
		System.out.println(puts);
	}

}
