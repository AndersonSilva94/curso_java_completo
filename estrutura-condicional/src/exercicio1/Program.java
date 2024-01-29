package exercicio1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Digite um número inteiro:");
		number = sc.nextInt();
		
		if(number < 0) 
			System.out.println("NEGATIVO");
		else
			System.out.println("NAO NEGATIVO");
		
		sc.close();

	}

}
