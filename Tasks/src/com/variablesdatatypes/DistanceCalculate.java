package com.variablesdatatypes;

public class DistanceCalculate {
	public static void main(String[] args) {
		int totalMiles = 800;
		int milesTravelled = 537;

		double percentage = ((double) milesTravelled / totalMiles) * 100;

		int percentageInt = (int) percentage;

		System.out.println("The percentage of the trip completed is: " + percentageInt + "%");

	}

}
