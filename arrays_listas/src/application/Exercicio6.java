package application;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] results = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < vectA.length; i ++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < vectB.length; i ++) {
			vectB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < results.length; i ++) {
			results[i] = vectA[i] + vectB[i];
			System.out.println(results[i]);
		}
		
		sc.close();

	}

}
