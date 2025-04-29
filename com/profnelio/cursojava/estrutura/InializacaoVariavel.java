package com.profnelio.cursojava.estrutura;

public class InializacaoVariavel {

	public static void main(String[] args) {
		double discount;
		double price = 200;
		if (price > 100) {
			System.out.println(price);
			System.out.println("Entrou no if");
			discount = 1.0;
		} else {
			System.out.println(price);
			System.out.println("Entrou no else");
			discount = 2.0;
		}
		System.out.println(discount);
	}

}
