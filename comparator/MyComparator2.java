package comparator;

import java.util.Comparator;

import secao17c.entities.Product;

public class MyComparator2 implements Comparator<Product2> {
	@Override
	public int compare(Product2 p1, Product2 p2) {
		
		/*
		 * Here, the principle is very similar to comparable.
		 * 
		 * It is an integer if the first argument is greater than the second, it is zero
		 * if the first argument is equal to the second and it is negative if the first
		 * is less than the second.
		 * 
		 * 
		 * Aqui, o principio é bem parecido com o comparable.
		 * 
		 * É número inteiro caso o primeiro argumento seja maior que o segundo, é zero
		 * se primeiro argumento for igual ao segundo e é negativo se o primeiro for
		 * menor que o segundo.
		 * 
		 */
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
}
