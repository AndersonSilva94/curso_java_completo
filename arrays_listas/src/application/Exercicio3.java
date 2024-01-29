package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Exer3;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		Exer3[] vect = new Exer3[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Dados da %sa pessoa: %n", i + 1);
			System.out.println("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Idade:");
			int age = sc.nextInt();
			System.out.println("Altura:");
			double height = sc.nextDouble();
			vect[i] = new Exer3(name, age, height);
		}
		
		double min = vect[0].getHeight();
		double max = vect[0].getHeight();
		
		int sum = 0;
		double sumHeight = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sumHeight += vect[i].getHeight();
			/*
			if(min > vect[i].getHeight()) {
				min = vect[i].getHeight();
			} 
			if (max < vect[i].getHeight()) {
				max = vect[i].getHeight();
			}
			*/
			
			if(vect[i].getAge() < 16) {
				sum += 1;
			}
		}
		
		double avg = sumHeight / vect.length;
		double percentage = (sum * 100) / vect.length;
		
		System.out.println();
		
		System.out.printf("Altura média: %.2f%n", avg);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentage);
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();

	}

}
