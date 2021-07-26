package br.com.estudos.java.exercicios.polimorfismo.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends ProductEx3 {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;

	public UsedProduct() {

	}

	public UsedProduct(String name, Double prince, Date manufactureDate) {
		super(name, prince);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		return getName() + "# used #" + String.format("%.2f", getPrice()) + "manufacture date: "
				+ sdf.format(manufactureDate) + ")";
	}

}
