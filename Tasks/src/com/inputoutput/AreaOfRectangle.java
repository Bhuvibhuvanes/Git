package com.inputoutput;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Lenght :");
		double lenght = input.nextDouble();
		System.out.println("Enter the Breadth :");
		double breadth = input.nextDouble();
		int area = (int) (lenght * breadth);
		System.out.println("Area of Rectangle :" + area);

	}

}
