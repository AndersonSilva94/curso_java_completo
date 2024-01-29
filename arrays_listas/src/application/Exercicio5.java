package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números serão digitados? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		double max = vect[0];
		int position = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			
			if(max < vect[i]) {
				max = vect[i];
				position = i;
			}
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %s%n", max);
		System.out.printf("POSICAO DO MAIOR VALOR = %s", position);
		
		sc.close();

	}

}
