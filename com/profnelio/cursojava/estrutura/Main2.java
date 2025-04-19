package com.profnelio.cursojava.estrutura;

public class Main2 {

	public static void main(String[] args) {

		double preco = 20.0;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.5;
		System.out.println(preco - desconto);

	}

}
