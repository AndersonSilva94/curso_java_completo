package application;

import java.util.Scanner;

import entities.Exer9;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanta pessoas você vai digitar? ");
		int n = sc.nextInt();
		
		Exer9[] person = new Exer9[n];
		
		int position = 0;
		int max = 0;
		
		for(int i = 0; i < person.length; i++) {
			System.out.printf("Dados da %sa pessoa:%n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			person[i] = new Exer9(name, age);
			
			if(max < person[i].getAge()) {
				max = person[i].getAge();
				position = i;
			}
		}
		System.out.printf("PESSOA MAIS VELHA: %s%n", person[position].getName());
		
		sc.close();

	}

}
