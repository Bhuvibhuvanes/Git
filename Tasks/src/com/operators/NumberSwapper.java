package com.operators;

import java.util.Scanner;

public class NumberSwapper {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the value of x : ");
		int x = scanner.nextInt();
		System.out.print("Enter the value of x : ");

		int y = scanner.nextInt();

		System.out.println("Before swapping numbers: " + x + " " + y);

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("After swapping: " + x + " " + y);

		scanner.close();
	}
}
