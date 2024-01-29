package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double depositValue;
		BankAccount ba;
		
		System.out.println("Enter account number: ");
		int account = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.println("Is there an initial deposit value (y/n)?");
		char initial = sc.nextLine().charAt(0);
		
		if(initial == 'y') {
			System.out.println("Enter initial deposit value: ");
			depositValue = sc.nextDouble();
			ba = new BankAccount(holder, account, depositValue);
		} else {
			ba = new BankAccount(holder, account);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(ba);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		depositValue = sc.nextDouble();
		ba.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(ba);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		depositValue = sc.nextDouble();
		ba.withdraw(depositValue);
		System.out.println("Updated account data:");
		System.out.println(ba);
	
		sc.close();

	}

}
