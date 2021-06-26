package br.com.estudos.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.estudos.entidades.Produto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Entre com a data do produto");
		System.out.println("Name: ");
		produto.name = sc.nextLine();
		System.out.println("Price: ");
		produto.price = sc.nextDouble();
		System.out.println("Quantidade no Estoque: ");
		produto.quantity = sc.nextDouble();
		System.out.println(produto.name + " , " 
							+ produto.price + " , "
							+ produto.quantity);
		
		System.out.println(produto);
		
		System.out.println( );
		System.out.println( " Entre com a quantidade de produtos que serão adicionados: " );
		int quantity = sc.nextInt();
		produto.addProducts(quantity);
		
		
		System.out.println(produto);
		
		System.out.println( );
		System.out.println( " Entre com a quantidade de produtos que serão retirados do estoque: " );
		quantity = sc.nextInt();
		produto.removeProducts(quantity);
		
		System.out.println(produto);
		sc.close();
	} 

}
