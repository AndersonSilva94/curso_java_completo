package exercicio1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua senha:");
		
		int number = sc.nextInt();
		int password = 2002;
		
		while(number != password) {
			System.out.println("Senha inválida");
			number = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();

	}

}
