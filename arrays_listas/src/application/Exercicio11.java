package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Exer11;

public class Exercicio11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		Exer11[] person = new Exer11[n];
		
		for(int i = 0; i < person.length; i++) {
			System.out.printf("Altura da %sa pessoa: ", i + 1);
			double height = sc.nextDouble();
			sc.nextLine();
			System.out.printf("Genero da %sa pessoa: ", i + 1);
			char gender = sc.nextLine().charAt(0);
			person[i] = new Exer11(height, gender);
		}
		
		double max = person[0].getHeight();
		double min = person[0].getHeight();
		double sumWomanHeight = 0.0;
		int manNumber = 0;
		
		for(int i = 0; i < person.length; i++) {
			if (max < person[i].getHeight()) {
				max = person[i].getHeight();
			}
			
			if(min > person[i].getHeight()) {
				min = person[i].getHeight();
			}
			
			if(person[i].getGender() == 'F' || person[i].getGender() == 'f') {
				sumWomanHeight += person[i].getHeight();
			} else {
				manNumber += 1;
			}
		}
		
		double avgWomanHeight = sumWomanHeight / (person.length - manNumber);
		
		System.out.printf("Menor altura = %s%n", min);
		System.out.printf("Maior altura = %s%n", max);
		System.out.printf("Media da altura das mulheres = %.2f%n", avgWomanHeight);
		System.out.printf("Numero de homens = %s", manNumber);
		
		sc.close();

	}

}
