package Entities;

public class Product {
	
	private String name;
	private Double price;
	
	// construtor simples.
	public Product() {
	}

	// construtor completo com argumentos.
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	// Getters end Setters.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
