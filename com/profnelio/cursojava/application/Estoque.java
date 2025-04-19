package com.profnelio.cursojava.application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Estoque {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();

		Product product = new Product(name, price, quantity);
		;
		// System.out.println(product.name + " " + product.price + " " +
		// product.quantity);
		System.out.println("================================");
		System.out.println(product);
		System.out.println("================================");
		System.out.println();

		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("================================");
		System.out.println("updated data: " + product);
		System.out.println("================================");
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("================================");
		System.out.println("updated data: " + product);
		System.out.println("================================");

		sc.close();

	}

}
