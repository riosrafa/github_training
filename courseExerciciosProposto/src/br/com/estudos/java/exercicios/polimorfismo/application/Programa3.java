package br.com.estudos.java.exercicios.polimorfismo.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.estudos.java.exercicios.polimorfismo.entities.ImportedProductEx3;
import br.com.estudos.java.exercicios.polimorfismo.entities.ProductEx3;
import br.com.estudos.java.exercicios.polimorfismo.entities.UsedProduct;

public class Programa3 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of Products: ");
		int n = sc.nextInt();
		List<ProductEx3> lista = new ArrayList<>();

		// quantas vezes vai se repetir o maldito kk
		for (int i = 0; i < n; i++) {
			System.out.print("Product # " + i + " data: ");
			System.out.println("Common, used or imported (c/u/i)? ");
			char aux = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Price: ");
			double price = sc.nextDouble();

			if (aux == 'c') {
				lista.add(new ProductEx3(name, price));
			} else if (aux == 'u') {
				System.out.print("Manufacture date (dd/MM/yyyy): ");
				Date date = sdf.parse(sc.next());
				lista.add(new UsedProduct(name, price, date));
			} else {
				System.out.println("Customs fee: ");
				double customsFee = sc.nextDouble();
				lista.add(new ImportedProductEx3(name, price, customsFee));
			}

		}

		System.out.println("############$###########################");
		System.out.println("Price TAGS: ");
		for (ProductEx3 prod : lista) {
			System.out.println(prod.priceTag());
		}

		sc.close();
	}

}
