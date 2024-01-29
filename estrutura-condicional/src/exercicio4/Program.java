package exercicio4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inicio, fim, total;
		
		System.out.println("Digite a hora inicial e final do jogo:");
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		if(inicio > fim) {
			total = (24 - inicio) + fim;
		} else if (inicio == fim) {
			total = 24;
		} else {
			total = fim - inicio;
		}
		
		System.out.printf("O JOGO DUROU %s HORA(S)", total);
		
		sc.close();

	}

}
