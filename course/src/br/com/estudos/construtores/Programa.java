package br.com.estudos.construtores;

import java.util.Locale;
import java.util.Scanner;

import br.com.estudos.entidades.Product;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Enterproductdata: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantityin stock: ");
		int quantity = sc.nextInt();

		@SuppressWarnings("unused")
		Product product2 = new Product(name, price, quantity);

		System.out.println();
		System.out.println("Productdata: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		
		quantity = sc.nextInt();

		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updateddata: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		
		quantity = sc.nextInt();

		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updateddata: " + product);

		sc.close();
	}

}
