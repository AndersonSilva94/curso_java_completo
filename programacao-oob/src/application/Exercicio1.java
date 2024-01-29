package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Exer1;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Exer1 rectangle = new Exer1();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.largura = sc.nextDouble();
		rectangle.altura = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
		
		sc.close();

	}

}
