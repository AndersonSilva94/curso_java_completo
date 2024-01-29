package exercicio3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Digite dois números inteiros:");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A > B) {
			if(A % B == 0)
				System.out.println("São multiplos");
			else
				System.out.println("Nao sao multiplos");
		} else {
			if(B % A == 0)
				System.out.println("São multiplos");
			else
				System.out.println("Nao sao multiplos");
		}
		
		sc.close();

	}

}
