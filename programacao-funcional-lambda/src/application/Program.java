package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file full path: ");
		
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Employee> emps = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				emps.add(new Employee(
					fields[0],
					fields[1],
					Double.parseDouble(fields[2])
				));
				
				line = br.readLine();
			}
			
			Comparator<String> comp = (s1, s2) -> s1.compareTo(s2);
			
			System.out.print("Insert a salary value: ");
			Double salary = sc.nextDouble();
			
			List<String> emails = emps.stream()
					.filter(p -> p.getSalary() > salary)
					.map(p -> p.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than " + salary);
			emails.forEach(System.out::println);
			
			Double totalSalary = emps.stream()
					.filter(p -> p.getName().charAt(0) == 'M')
					.map(p -> p.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.println("Sum of salary of people whose name starts with 'M': " + totalSalary);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}
