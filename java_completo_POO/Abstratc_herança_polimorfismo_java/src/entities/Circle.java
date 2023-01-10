package entities;

import entities.enums.Color;

/*
 * Sub classe com um metodo responsavel por calcular a area do circulo.
 */

public class Circle extends Shape {

	private Double radius;
	
	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	// polimorfismo do metodo da super classe.
	@Override
	public Double area() {
		return Math.PI * radius * radius;
	}
}
