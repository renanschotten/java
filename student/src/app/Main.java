package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("Name: ");
		student.name = sc.next();
		System.out.print("Grade 1: ");
		student.grade1 = sc.nextDouble();
		System.out.print("Grade 2: ");
		student.grade2 = sc.nextDouble();
		System.out.print("Grade 3: ");
		student.grade3 = sc.nextDouble();
		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
		System.out.println(student.status());
		if(student.status() == "FAILED") {
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		}
		sc.close();
	}

}
