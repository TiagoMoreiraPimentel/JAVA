package App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		// blibioteca que define o teclado americano podendo utilizar pontos ao invés de virgula.
		Locale.setDefault(Locale.US);
		// Metodo Scanner para capturar dados do teclado do usuario.
		Scanner sc = new Scanner(System.in);
		// metodo de formatação de data.
		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/yyyy");
		// Criando uma lista do tipo produto.
		List<Product> list = new ArrayList<>();

		// perguntando quantos produtos serão armazenados na lista.
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		// laço for para inicar a captura de informações e armazenar na lista.
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			// armazena a primeira letra inserida.
			char ch = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Price: ");
			Double price = sc.nextDouble();
			
			// estrutura if que adiciona as informações em Product se for inserido 'c'.
			if(ch == 'c') {
				list.add(new Product(name, price));
			}
			// estrutura if que adiciona as informações em UsedProduct se for inserido 'u'.
			else if(ch == 'u') {
				System.out.print("Manufacture date (dd/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
			}
			// estrutura if que adiciona as informações em ImportedProduct se for inserido 'i'.
			else if(ch == 'i') {
				System.out.println("Customs fee: ");
				Double customs = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customs));
			}
			else {
				System.out.println("Opção invalida! ");
			}
				
		}

		System.out.println();
		System.out.println("PRICE TAGS: ");
		// laço for que percorre a lista e imprime a função priceTAG() que mostra os resultados gerados dentro das classes. (Polimorfismo)
		for(Product product : list) {
			System.out.println(product.priceTag());
		}
		
			// encerra o scanner.
			sc.close();

	}

}
