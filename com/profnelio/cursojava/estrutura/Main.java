package com.profnelio.cursojava.estrutura;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		double x = 10.35784;
		System.out.println(x); // pega o . decimal da variável
		System.out.printf("%.2f%n", x); // pega o separador decimal do lingua do compytadir
		System.out.printf("%.4f%n", x); // pega o separador decimal do lingua do compytadir
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x); // Impressao da var x após aplic. do Locale.

	}

}
