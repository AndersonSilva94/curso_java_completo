package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code, qtd;
		double total;
		
		System.out.println("Digite o código e a quantidade:");
		code = sc.nextInt();
		qtd = sc.nextInt();
		
		switch(code) {
			case 1:
				total = (double) qtd * 4.00;
				break;
			case 2:
				total = (double) qtd * 4.50;
				break;
			case 3:
				total = (double) qtd * 5.00;
				break;
			case 4:
				total = (double) qtd * 2.00;
				break;
			case 5:
				total = (double) qtd * 1.50;
				break;
			default:
				total = 0;
				System.out.println("Produto inexistente");
				break;
		}
		
		System.out.printf("Total: R$ %.2f", total);
		sc.close();

	}

}
