package application;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de linhas e colunas: ");
		Integer X = sc.nextInt();
		Integer Y = sc.nextInt();
		
		int [][] mat = new int[X][Y];
		
		System.out.println();
		System.out.println("Digite os números que deseja: ");
		for(int i = 0; i < X; i++) {
			for(int j = 0; j < Y; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Digite o número que deseja buscar: ");
		Integer searchNumber = sc.nextInt();
		
		for(int i = 0; i < X; i++) {
			for(int j = 0; j < Y; j++) {
				if(mat[i][j] == searchNumber) {
					System.out.printf("Position %s, %s: %n", i, j);
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		
		
		
		sc.close();

	}

}
