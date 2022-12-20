package Entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	private Product product;
	
	// construtor simples.
	public OrderItem() {
	}

	// construtor completo com argumentos.
	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	// Getters end Setters.
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	// Função que multiplica o preço pela quantidade segundo enunciado.
	public Double subTotal() {
		return price * quantity;
	}
	
	// Função toString que formata os tectos da classe OrderItem de acordo com enunciado.
	@Override
	public String toString() {
		return getProduct().getName() + ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " + quantity + ", " 
				+ "Subtotal: $" + String.format("%.2f", subTotal());
	}
	
	

}
