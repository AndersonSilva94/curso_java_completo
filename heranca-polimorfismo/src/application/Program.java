package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.printf("Product #%s data: %n", i);
			System.out.print("Commom, used or imported (c/u/i)? ");
			sc.nextLine();
			char ch = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			switch(ch) {
				case 'i':
					System.out.print("Customs fee: ");
					Double customsFee = sc.nextDouble();
					list.add(new ImportedProduct(name, price, customsFee));
					break;
				case 'u':
					System.out.print("Manufacture date: ");
					Date manufactureDate = sdf.parse(sc.next());
					list.add(new UsedProduct(name, price, manufactureDate));
					break;
				default:
					list.add(new Product(name, price));
					break;
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product product : list) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}

}
