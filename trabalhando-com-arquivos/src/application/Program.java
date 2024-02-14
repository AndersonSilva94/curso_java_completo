package application;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		String sourcePath = "C:\\temp\\source.txt";
		File parentFile = new File(sourcePath);
		String target = parentFile.getParent() + "\\out";
		
		List<Product> products = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourcePath))) {
			String line = br.readLine();
			
			while (line != null) {
				String[] items = line.split(",");
				Product p = new Product(items[0], Double.parseDouble(items[1]), Integer.parseInt(items[2]));
				products.add(p);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		boolean targetFolder = new File(target).mkdir();
		
		if(targetFolder) {
			String targetPath = target + "\\summary.csv";			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetPath, true))) {
				for (Product product : products) {
					bw.write(product.toString());
					bw.newLine();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
