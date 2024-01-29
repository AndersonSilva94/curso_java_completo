package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Exer4;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?? ");
		double totalDollar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", Exer4.totalCurrency(dollarPrice, totalDollar));
		
		sc.close();

	}

}
