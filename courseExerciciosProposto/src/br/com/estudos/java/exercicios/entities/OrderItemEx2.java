package br.com.estudos.java.exercicios.entities;

public class OrderItemEx2 {

	private Integer quantity;
	private Double prince;

	// referencia a classe produto com esse objeto
	private ProductEx2 product;

	public OrderItemEx2() {

	}

	public OrderItemEx2(Integer quantity, Double prince, ProductEx2 product) {
		this.prince = prince;
		this.quantity = quantity;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrince() {
		return prince;
	}

	public void setPrince(Double prince) {
		this.prince = prince;
	}

	public ProductEx2 getProduct() {
		return product;
	}

	public void setProduct(ProductEx2 product) {
		this.product = product;
	}

	public Double subTotal() {
		return prince * quantity;
	}
/*
	@Override
	public String toString() {
		return getProduct().getName() 
				+ ", $" 
				+ String.format("%2.f", prince) 
				+ " , Quantity: " + ", Subtotal: $"
				+ String.format("%2.f", subTotal());
	}
*/

	@Override
	public String toString() {
		return "OrderItemEx2 [quantity=" + quantity + ", prince=" + prince + ", product=" + product.getName() + "]";
	}
	
	
}
