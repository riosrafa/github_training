package br.com.estudos.java.exercicios.polimorfismo.entities;

public class ProductEx3 {

	
	private String name;
	private Double price;
	
	public ProductEx3() {
		
	}

	public ProductEx3(String name, Double prince) {
		super();
		this.name = name;
		this.price = prince;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double prince) {
		this.price = prince;
	}
	
	public String priceTag() {
		return name;
		
	}
}
