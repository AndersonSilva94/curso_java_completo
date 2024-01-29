package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Exer2;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Exer2 employee = new Exer2();
		
		System.out.println("Enter data employee: ");
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		System.out.println();
		System.out.printf("Employee: %s%n", employee);
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println();
		System.out.printf("Updated data: %s%n", employee);
		
		sc.close();

	}

}
