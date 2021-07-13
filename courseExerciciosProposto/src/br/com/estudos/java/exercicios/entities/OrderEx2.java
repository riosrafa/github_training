package br.com.estudos.java.exercicios.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.estudos.java.exercicios.enums.OrderStatus;

public class OrderEx2 {

	private Date moment;
	private OrderStatus status;

	// 1 um pedido tem 1 cliente e varios itens
	private ClientEx2 client;

	// 1 pedido, tem varias
	private List<OrderItemEx2> items = new ArrayList<>();

	public OrderEx2() {

	}

	public OrderEx2(Date moment, OrderStatus status, ClientEx2 client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public ClientEx2 getClient() {
		return client;
	}

	public void setClient(ClientEx2 client) {
		this.client = client;
	}

	// metodos
	public void addItem(OrderItemEx2 item) {
		items.add(item);
	}

	public void removeItem(OrderItemEx2 item) {
		items.remove(item);
	}

	// metodo poderia ser feito com lambda
	public double total() {
		double soma = 0.0;
		for (OrderItemEx2 c : items) {
			soma += c.subTotal();// usamos o subtotal para realizar o calculo de cada obj
		}
		return soma;

	}
}
