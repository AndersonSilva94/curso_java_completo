package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números serão digitados? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		int sum = 0;
		int total = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
			
			if(vect[i] % 2 == 0) {
				sum += vect[i];
				total += 1;
			}
		}
		
		if(total > 0) {
			double avg = sum / total;
			System.out.printf("MEDIA DOS PARES = %.1f", avg);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();

	}

}
