package comparator;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		for (Product p : list) {
			System.err.println(p);
		}
	}
}
/*
 * Comparator<T> is a functional interface.
 * 
 * But what is a functional interface? It is an interface that has only one
 * abstract method.
 * 
 * It can have static and default methods. However, the method that we will
 * implement and use the most will be the "compare" 
 * 
 * method compare(T 01, T 02) // Compares its two arguments for order
 * 
 */