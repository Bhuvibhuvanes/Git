package com.operators;

import java.util.Scanner;

public class SquareAndCubeCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		System.out.println(number+"\t"+number*number+"\t"+number*number*number);
		number++;
		System.out.println(number+"\t"+number*number+"\t"+number*number*number);

		number++;
		System.out.println(number+"\t"+number*number+"\t"+number*number*number);

		number++;
		System.out.println(number+"\t"+number*number+"\t"+number*number*number);

		number++;
		System.out.println(number+"\t"+number*number+"\t"+number*number*number);

	}

}
