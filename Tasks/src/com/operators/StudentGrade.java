package com.operators;

public class StudentGrade {
	public static void main(String[] args) {
		int totalStudent = 90;
		int boys = 45;
		double percentage = 50.0;
		int studentsWithGradeA = (int) (totalStudent * percentage / 100);
		int boysWithGradeA = 20;
		int girlsWithGradeA = studentsWithGradeA - boysWithGradeA;

		System.out.println("Total number of girls getting grade 'A': " + girlsWithGradeA);
	}

}
