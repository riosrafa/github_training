package br.com.estudos.java.exercicios.entities;

public class ProductEx2 {

	private String name;
	private Double prince;
	
	public ProductEx2() {
		
	}
	
	public ProductEx2(String name, Double prince) {
		this.name = name;
		this.prince = prince;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrince() {
		return prince;
	}
	public void setPrince(Double prince) {
		this.prince = prince;
	}
	
	
	
}
