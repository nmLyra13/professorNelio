package aulao004.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import aulao004.entities.Client;
import aulao004.entities.Order;
import aulao004.entities.OrderItem;
import aulao004.entities.Product;
import aulao004.entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Product p = new Product("TV", 1000.0);
		// OrderItem oi1 = new OrderItem(1, 1000.0, p);
		// System.out.println(oi1.getProduct().getName());

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("e-mail: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY");
		Date birthDate = sdf.parse(sc.next());

		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());

		Order order = new Order(new Date(), status, client);

		System.out.print("How manu items to this order? ");
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.println("Product name:");
			sc.next();
			String productName = sc.nextLine();
			System.out.println("Product price:");
			double productPrice = sc.nextDouble();
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();

			Product product = new Product(productName, productPrice);
			OrderItem it = new OrderItem(quantity, productPrice, product);

			order.addItem(it);

		}

		System.out.println();
		System.out.println(order);

		sc.close();

	}

}
