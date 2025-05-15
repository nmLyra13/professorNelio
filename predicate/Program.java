package predicate;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Table", 350.50));
		list.add(new Product("HD Case", 80.90));

		/*
		 * Lambda expression that says: Remove all "p" such that p.getName is greater
		 * than 100.
		 * 
		 * Expressão lambda que diz: Remova todo "p" tal que p.getName seja maior que
		 * 100.
		 * 
		 * predicado (p -> p.getName() >= 100;
		 * 
		 */
		
		list.removeIf(new ProductPredicate());
		
		for (Product p: list) {
			System.out.println(p);
		}
	}
	

}
