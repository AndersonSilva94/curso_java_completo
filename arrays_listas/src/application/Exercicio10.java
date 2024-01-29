package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Exer10;

public class Exercicio10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		
		Exer10[] person = new Exer10[n];
		
		for (int i = 0; i < person.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %so aluno:%n", i + 1);
			sc.nextLine();
			String name = sc.nextLine();
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			person[i] = new Exer10(name, n1, n2);
		}
		
		System.out.println("Alunos aprovados: ");
		for(int i = 0; i < person.length; i++) {
			if(person[i].media() >= 6.0) {
				System.out.println(person[i].getName());
			}
		}
		
		sc.close();

	}

}
