package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Exer13;

public class Exercicio13 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Exer13> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Employee #%s: %n", i + 1);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Exer13 employee = new Exer13(id, name, salary);
			list.add(employee);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		Integer code = sc.nextInt();

		Exer13 empResult = list.stream().filter(emp -> emp.getId() == code).findFirst().orElse(null);
		
		System.out.println(list);
		if(empResult != null) {
			System.out.print("Enter the percentage: ");
			Double percentage = sc.nextDouble();
			empResult.calculateIncrease(percentage);
		} else {
			System.out.print("This id does not exist!");
		}
		
		System.out.println("List of employees: ");
		for(Exer13 emp : list) {
			System.out.println(emp.getId() + ", " +
					emp.getName() + ", " +
					String.format("%.2f", emp.getSalary()));
		}
		
		sc.close();

	}

}
