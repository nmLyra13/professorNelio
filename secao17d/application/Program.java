package secao17d.application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		// Attention: The supertype of any list type is the wildcard "?"
		// Atenção: O supertipo de qualquer tipo de lista é coringa "?"
		List<Integer> myInts = Arrays.asList(5,2,10);
		printList(myInts);
		System.out.println("---------");
		// let's test a list of strings here
		List<String> myStrs = Arrays.asList("Maria", "Bob", "Marcos"); 
		printList(myStrs);
	}
	
	// This same method here works for any other type of list.
	// Este mesmo método aqui funciona para qualquer outro tipo de lista.
	public static void printList(List<?> list) {
		/*
		 * We cannot add data to the list because we do not know what type the list is. It gives a compilation error.
		 * 
		 * Não podemos adicionar dados a lista, pois não sabemos de que tipo é a lista. Dar erro de compilação.
		 * 
		 * Por exemplo: list.add(3) <= aqui dá erro de compilação.
		 * 
		 */
		for (Object obj: list) {
			System.out.println(obj);
		}
	}

}
