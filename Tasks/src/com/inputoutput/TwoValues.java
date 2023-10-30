package com.inputoutput;

import java.util.Scanner;

public class TwoValues {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first:");
		String first = scanner.nextLine();

		System.out.println("Enter second:");
		String second = scanner.nextLine();

		System.out.println("Enter third:");

		System.out.println("------------");
		System.out.println(first);
		System.out.println("------------");
		System.out.println(second);
		System.out.println("------------");

		scanner.close();
	}

}
