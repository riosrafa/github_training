package br.com.estudos.entidades;

public class Product {

	public String name;
	public double price;
	public int quantity;
/*
 * Os construtores servem para controlar o fluxo na criação  
 * dos objetos e para evitar erros no momento da instaciação
 * 
 * */
	//construtores por defull
	public Product() {
		
	}
	//construtores com argumentos/parametros
	public Product(String name, double price, int quantity) {
		this.name  = name; // aqui, atribuimos o valor q recebemos por parametro e jogamos na variavel da classe
		this.price = price;
		this.quantity = quantity;
	}
	public double totalValueInStock() {
		return price* quantity;
		}

	public void addProducts(int quantity) {
		this.quantity += quantity;
		}
	public void removeProducts(int quantity) {
		this.quantity-= quantity;
		}

	public String toString() {
		return name+ ", $ "+ String.format("%.2f", price)+ ", "+ quantity+ " units, Total: $ "+ String.format("%.2f", totalValueInStock());
		}
}
