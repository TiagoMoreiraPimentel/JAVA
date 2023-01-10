package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import entities.enums.Color;
import entities.Rectangle;
import entities.Circle;

/*
 * Classe principal, que contém o codigo principal do programa.
 */

public class Program {

	public static void main(String[] args) {
		
		// biblioteca que altera o teclado para padrões americano com ponto ao invés da virgula.
		Locale.setDefault(Locale.US);
		// biblioteca que define o metodo scanner, para capturar dados do usuario.
		Scanner sc = new Scanner(System.in);
		// Instanciando a lista que definara quantos produtos o usuario vai inserir.
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		// laço for para inserir os dados do usuario.
		for(int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			
			// verifica com o usuario se ele quér calcular inserir os dados do retangulo ou do circulo.
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			
			// neste codigo o programa coleta qual a cor da forma do tipo enumerado.
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
	
			if(ch == 'r') {

				// coleta as areas das formas.
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				System.out.print("Height: ");
				Double height = sc.nextDouble();
				
				// instancia e adiciona os valores do retangulo digitados na lista.
				list.add(new Rectangle(color, width, height));
			}
			else if(ch == 'c') {
				
				// coleta o raio do circulo.
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				
				// instancia e adiciona os valores do circulo digitados na lista.
				list.add(new Circle(color, radius));
			}
		}
		
		// faz a leitura da lista para imprimir as areas das formas.
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		
		for(Shape shape : list) {
			System.out.printf(String.format("%.2f%n", shape.area()));
		}
		
		sc.close();
	}
}
