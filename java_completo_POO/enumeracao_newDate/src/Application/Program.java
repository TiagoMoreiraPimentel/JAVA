package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import Entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		// instancia o teclado padrão americado com pontos ao invés de virgula.
		Locale.setDefault(Locale.US);
		// Instancia o metodo scanner para coletar dados do teclado.
		Scanner sc = new Scanner(System.in);

		// Inicio do programa (solicitando dados do cliente)
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		// pega a data digitada e transforma em formato data.
		Date birtDate = sdf.parse(sc.next());

		// Importar cliente, email e data.
		Client client = new Client(name, email, birtDate);

		System.out.println("Enter order data:");
		System.out.print("Status: ");
		
		// Registra informação digitada no enumerado.
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		// instancia a classe Order.
		Order order = new Order(new Date(), status, client);

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();

			// Instanciando o produto.
			Product product = new Product(productName, productPrice);

			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

			// Instanciando o pedido.
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);

			order.addItem(orderItem);
		}

		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);

		// Encerra o modo Scanner
		sc.close();

	}

}
