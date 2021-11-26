package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}

		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getPrice();
		}
		double avg = soma / n;

		System.out.printf("AVERAGE PRICE: %.2f%n", avg);

		sc.close();

	}

}
