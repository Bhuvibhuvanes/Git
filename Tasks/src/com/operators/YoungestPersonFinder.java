package com.operators;

import java.util.Scanner;

public class YoungestPersonFinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int person = input.nextInt();
		System.out.println("Enter the second number :");
		int persontwo = input.nextInt();
		System.out.println("Enter the third number :");
		int personthree = input.nextInt(); // (x > y) ? (x > z ? x : z) : (y > z ? y : z);🤔

		int youngest = (person < persontwo) ? (person < personthree ? person : personthree)
				: (persontwo < personthree ? persontwo : personthree);

		System.out.println("Youngest person is " + youngest);
	}

}
