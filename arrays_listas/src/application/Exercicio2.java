package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar?");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		String values = "";
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite um número:");
			vect[i] = sc.nextDouble();
			
			if(i != vect.length - 1) {
				values += vect[i] + " ";
			} else {
				values += vect[i];
			}
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i ++) {
			sum += vect[i];
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("VALORES = %s%n", values);
		System.out.printf("SOMA = %.2f%n", sum);
		System.out.printf("MEDIA = %.2f%n", avg);
		
		sc.close();

	}

}
