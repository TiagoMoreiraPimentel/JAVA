package Entities;

public class ImportedProduct extends Product {
	
	private Double customsFee;
	
	// construtor sem argumentos.
	public ImportedProduct() {
		super();
	}

	// construtor com argumentos.
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	// polimorfismo criado para chamar as tags.
	@Override
	public String priceTag() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customsFee)
				+ ")";
	}
	
	// metodo que soma o preço do produto com a taxa da alfandega.
	public Double totalPrice() {
		return getPrice() + customsFee;
	}
}
