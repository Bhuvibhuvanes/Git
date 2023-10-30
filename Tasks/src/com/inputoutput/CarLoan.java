package com.inputoutput;

public class CarLoan {
	
	public static void main(String[] args) {
		
		 if (args.length != 3) {
	            System.out.println("Usage: java CarLoan P Y R");
	            return;
	        }

	        double P = Double.parseDouble(args[0]);
	        int Y = Integer.parseInt(args[1]);
	        double R = Double.parseDouble(args[2]);

	        int n = 12 * Y;
	        double r = (R / 100) / 12;

	        double numerator = P * r;
	        double denominator = 1 - Math.pow(1 + r, -n);
	        double payment = numerator / denominator;

	        System.out.println("Monthly Payment: " + payment);
		
	
	}

}
