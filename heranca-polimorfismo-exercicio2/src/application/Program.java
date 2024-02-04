package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.printf("Tax payer #%s data: %n", i);
			System.out.print("Individual or company (i/c)? ");
			sc.nextLine();
			char ch = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			Double anualIncome = sc.nextDouble();
			
			switch(ch) {
				case 'i':
					System.out.print("Health expenditures: ");
					Double healthExpenditures = sc.nextDouble();
					list.add(new Individual(name, anualIncome, healthExpenditures));
					break;
				default:
					System.out.print("Number of employees: ");
					Integer employeesNumber = sc.nextInt();
					list.add(new Company(name, anualIncome, employeesNumber));
					break;
			}
		}
		
		System.out.println();
		Double sum = 0.0;
		System.out.println("TAXES PAID:");
		for(TaxPayer payer : list) {
			sum += payer.tax();
			System.out.printf("%s: $ %.2f%n", payer.getName(), payer.tax());
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", sum);
		
		sc.close();

	}

}
