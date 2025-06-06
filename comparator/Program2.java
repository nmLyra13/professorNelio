package comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {

		List<Product2> list = new ArrayList<>();

		list.add(new Product2("TV", 900.00));
		list.add(new Product2("Notebook", 1200.00));
		list.add(new Product2("Tablet", 450.00));

		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product2 p : list) {
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