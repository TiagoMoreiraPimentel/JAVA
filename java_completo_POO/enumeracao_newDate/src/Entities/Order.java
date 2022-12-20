package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entities.enums.OrderStatus;

public class Order {
	
	// instanciando a formatação sdf do toString do objeto moment. "20/04/2018 11:25:09"
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	// moment do tipo data.
	private Date moment;
	// status do tipo OrderStatus.
	private OrderStatus status;
	// Apenas um cliente.
	private Client cliente;
	// lista para muitos items.
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	// construtor sem argumentos.
	public Order() {
	}

	// construtor com argumentos.
	public Order(Date moment, OrderStatus status, Client cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	// Getters end Setters.
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

	public Client getCliente() {
		return cliente;
	}

	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}
	
	// Função de adicionar itens na lista.
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	// Função de remover itens na lista.
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	// Função que soma todos os subtotais da minha ordem.
	public double total() {
		double sum = 0;
		for(OrderItem it : items) {
			sum += it.subTotal();
		}
		return sum;
	}
	
	// Formatação toString para a classe Order.
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(cliente + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
}
