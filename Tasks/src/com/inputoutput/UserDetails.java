package com.inputoutput;

import java.util.Scanner;

public class UserDetails {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Your Name :");
		String name=input.nextLine();
		System.out.println("Enter Your City:");
		String city=input.nextLine();
		System.out.print("Hey, my name is "+name);
		System.out.println(" and I’m from "+city+".");
	}

}
