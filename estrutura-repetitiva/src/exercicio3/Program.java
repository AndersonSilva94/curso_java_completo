package exercicio3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código:");
		
		int alcool = 0;
		int gasoline = 0;
		int diesel = 0;
		
		int code = sc.nextInt();
		
		while(code != 4) {
			if(code < 1 || code > 4) {
				System.out.println("Digite o código corretamente:");
				code = sc.nextInt();
				continue;
			}
			
			if(code == 1) {
				alcool += 1;
			} else if(code == 2) {
				gasoline += 1;
			} else {
				diesel += 1;
			}
			
			code = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %s%n", alcool);
		System.out.printf("Gasolina: %s%n", gasoline);
		System.out.printf("Diesel: %s%n", diesel);
		
		sc.close();

	}

}
