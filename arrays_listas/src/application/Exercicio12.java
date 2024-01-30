package application;

import java.util.Scanner;

import entities.Exer12;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		System.out.println();
		
		Exer12[] person = new Exer12[10];
		
		int increment = 0;
		
		while(increment < n) {
			System.out.printf("Rent #%s: %n", increment + 1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			if(person[room] != null) {
				while(person[room] != null) {
					System.out.print("Quarto ocupado! Tente outro: ");
					room = sc.nextInt();
				}
			}
			person[room] = new Exer12(name, email, room);
			System.out.println();
			increment++;
		}
		
		System.out.println("Busy rooms:");
		for(int i = 0; i < person.length; i++) {
			if(person[i] != null) {
				System.out.println(person[i]);
			}
		}
		
		sc.close();

	}

}
