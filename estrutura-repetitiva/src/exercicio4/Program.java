package exercicio4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		if(number >= 1 && number <= 1000) {
			for(int i = 0; i <= number; i++) {
				if(i % 2 != 0)
					System.out.println(i);
			}
		} else {
			System.out.println("Número fora do intervalo 1 - 1000");
		}
		
		sc.close();

	}

}
