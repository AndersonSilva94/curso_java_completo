package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Exer3;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Exer3 student = new Exer3();
		
		System.out.println("Enter student data: ");
		System.out.println("name: ");
		student.name = sc.nextLine();

		System.out.println("n1: ");
		student.n1 = sc.nextDouble();
		System.out.println("n2: ");
		student.n2 = sc.nextDouble();
		System.out.println("n3: ");
		student.n3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %s%n", student.calculateMedia());
		
		if(student.calculateMedia() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.verifyPoints());
		} else {
			System.out.println("PASS");
		}
		
		sc.close();

	}

}
