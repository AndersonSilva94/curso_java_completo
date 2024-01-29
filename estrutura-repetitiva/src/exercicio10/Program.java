package exercicio10;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			int square = (int) Math.pow(i, 2);
			int cube = (int) Math.pow(i, 3);
			
			System.out.printf("%s %s %s%n", i, square, cube);
		}
		
		sc.close();

	}

}
