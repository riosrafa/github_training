package br.com.estudos.entidades;

public class Produto {

	public String name;
	public double price;
	public double quantity;
	
	public double totalValueInStock() {
		return price*quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
		
	}
	
	@Override
	public String toString() {
		return "Produto [name=" + name + ", price=" + price + ", quantity=" + quantity + ", totalValueInStock()="
				+ totalValueInStock() + "]";
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
		
	}

}
