package com.inputoutput;

import java.util.Scanner;

public class Vohra {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter pizza amount :");
		int pizza=input.nextInt();
		System.out.println("Enter puff amount :");
		int puff=input.nextInt();
		System.out.println("Enter cool drinks amount :");
		int cooldrinks=input.nextInt();
		double totalbill=pizza+puff+cooldrinks;
		System.out.println("Total bill amount :"+totalbill);
		
	}

}
