package com.operators;

public class NumberOperators {
	public static void main(String[] args) {
		int number = 2345;
		int add=number += 8;
		int divide=add / 3;
		int modulo=divide% 5;
		int multiple=modulo*5;
		System.out.println("Final Result: " + multiple);
	}

}
