package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<>();
		String[] classes = new String[] { "A", "B", "C" };
		
		for(String clas : classes) {
			System.out.print("How many students for course " + clas + "? ");
			Integer number = sc.nextInt();
			
			for(int i = 0; i < number; i++) {
				Integer code = sc.nextInt();
				set.add(code);
			}
		}
		
		System.out.println("Total students: " + set.size());
		
		sc.close();
	}

}
