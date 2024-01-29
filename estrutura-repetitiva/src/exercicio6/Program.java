package exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			double m1 = sc.nextDouble();
			double m2 = sc.nextDouble();
			double m3 = sc.nextDouble();
			
			double media = (m1 * 2.0 + m2 * 3.0 + m3 * 5.0) / 10.0;
			
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
	}

}
