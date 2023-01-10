package entities;

import entities.enums.Color;

/*
 * Super classe abstrata generica que defines as formas do retangulo e do circulo.
 */

public abstract class Shape {
	
	private Color color;
	
	public Shape() {
	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	// metodo abstrato para obrigar o polimorfismos nas sub classes.
	public abstract Double area();

}
