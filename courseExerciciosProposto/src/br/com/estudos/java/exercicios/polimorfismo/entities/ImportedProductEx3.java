package br.com.estudos.java.exercicios.polimorfismo.entities;

public class ImportedProductEx3 extends ProductEx3{

	private Double customsFee;
	
	public ImportedProductEx3() {
		
	}

	public ImportedProductEx3(String name, Double prince, Double customsFee) {
		super(name, prince);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		return getName() +
				" $ "
				+ String.format("%.2f", totalPrice())
		        + " (customs fee: $ "
		        + String.format("%.2f", customsFee)
		        + ")";
	}
	//taxa + preço
	public Double totalPrice() {
		return getPrice() + customsFee;
	}
}
